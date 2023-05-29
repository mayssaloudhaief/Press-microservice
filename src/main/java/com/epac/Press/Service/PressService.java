package com.epac.Press.Service;


import com.epac.Press.DAO.DbSequenceRepository;
import com.epac.Press.DAO.ProductionPartInfoRepository;
import com.epac.Press.DAO.RollRespository;
import com.epac.Press.Entities.*;
import com.epac.Press.NotEntities.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.epac.Press.DAO.PressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class PressService {
@Autowired
PressRepository pressRepository;
@Autowired
RollRespository rollRespository;
    @Autowired
    ProductionPartInfoRepository productionPartInfoRepository;

@Autowired
RestTemplate template;

@Autowired
private KafkaTemplate<String, Press> kafkaTemplate;
    @Autowired
    DbSequenceRepository dbSequenceRepository;
    @Value(value = "${url}")
    String url;

public List<Press> getAll() {
    return pressRepository.findAll();
}
public Press receiveJob(String msj) throws JsonProcessingException {
    ObjectMapper m = new ObjectMapper();
    Press press = m.readValue(msj, Press.class);

    ArrayList<PartInfo> partInfos = new ArrayList<>();
    PartInfo partInfo =new PartInfo();
    for (ProductionPartInfo productionPartInfo : press.getProductionPartInfos()) {
        //    if (partInfo.getPartId().equals(productionPartInfo.getPartId())) {
                partInfo.setQuantity(partInfo.getQuantity() + productionPartInfo.getQtyRequested());
                if (productionPartInfo.getsNumber() > 0)
                    partInfo.setsNumber(productionPartInfo.getsNumber());


    ArrayList<UpdateInfoOrder> updateInfoOrders = new ArrayList<>();
        System.out.println("part info id=" + partInfo.getJobId());
     //   if (partInfo.getsNumberWaste() * partInfo. > 10000 && partInfo.getsNumber() > 0) {
            System.out.println("change S number");
            partInfo.setJobId("S0" +productionPartInfo.getPartId());
            partInfo.setsNumber(0);
            float height = 0;
             //   if (productionPartInfo.getPartId().equals(partInfo.getPartId())) {
                    height = productionPartInfo.getHeight();
                    productionPartInfo.setS0Height(productionPartInfo.getHeight());
                    UpdateInfoOrder updateInfoOrder = new UpdateInfoOrder(productionPartInfo.getProductionPartId(), 1, productionPartInfo.getHeight());
                    updateInfoOrders.add(updateInfoOrder);

            partInfo.setSubpartId(productionPartInfo.getSubpart().getIdSubpart());
            partInfo.setS0Height(height);
            partInfo.setTitle((productionPartInfo.getTitle()));
            partInfo.setPartId(productionPartInfo.getPartId());
            partInfo.setJobIdStandard(productionPartInfo.getSubpart().getIdSubpart());
            partInfos.add(partInfo);}
            press.setPartInfos(partInfos);
            System.out.println(press.getPartInfos());
            return pressRepository.save(press);

        }

    public ArrayList<Press> dissociateRoll(String machineId, long rollId) {
        Press press = pressRepository.findByRollId(rollId);
        press.setMachineId(null);
        press.setStatus("SCHEDULED");
        press.setOrdering(0);
        pressRepository.save(press);
        ArrayList<Press> presses = pressRepository.findByMachineIdAndStatusOrderByOrdering(machineId, "ASSIGNED");
        int i = 1;
        for (Press press1 : presses) {
            press1.setOrdering(i);
            pressRepository.save(press1);
            i++;
        }
        return pressRepository.findByMachineIdAndStatusOrderByOrdering(machineId, "ASSIGNED");
    }
    public Press StartPrintig(long rollid) {
        ArrayList<Press> presses = pressRepository.findAllByRollId(rollid);
        for (Press press:presses){
            for (ProductionPartInfo productionPartInfo: press.getProductionPartInfos()){
              //  if (productionPartInfo.getSubpart().getIdSubpart().equals(subpartId)){
                    String url1 ="http://"+ url + "/MACHINEANDSTATION-SERVICE/machineById/" + press.getMachineId();
                    HttpHeaders headers = new HttpHeaders();
                    headers.add("Accept", "application/json");
                    ResponseEntity<Machine> response =template.exchange(url1, HttpMethod.GET, new HttpEntity<Object>(headers), new ParameterizedTypeReference<Machine>() {
                    });
                    Machine machine = (Machine) (response.getBody());
                    press.setStatus("ON PROD");
                    pressRepository.save(press);
                    return press;


            }

        }
   return null;
        }




    public Press pausePrinting(long rollid)
    {
        Press press=pressRepository.findByRollId(rollid);
        press.setPaused(true);
        if(press.getMode().equals("EPAC"))
        {
            String url1 = "http://"+url + "/MACHINEANDSTATION-SERVICE/machineById/" + press.getMachineId();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Accept", "application/json");
            ResponseEntity<Machine> response = template.exchange(url1, HttpMethod.GET, new HttpEntity<Object>(headers), new ParameterizedTypeReference<Machine>() {
            });
            Machine machine = (Machine) (response.getBody());
            HttpEntity<PrintingRollObject> request = new HttpEntity<PrintingRollObject>(null, headers);

          /*  try {
                url = "http://" + machine.getAdressIp() + "/printer/printing/stop";
                ResponseEntity<Object> object = template.exchange(url, HttpMethod.GET, new HttpEntity<Object>(headers), new ParameterizedTypeReference<Object>() {});

            } catch (Exception e) {
                e.printStackTrace();
            }

           */

            return pressRepository.save(press);
        }
        else
        {
            return pressRepository.save(press);
        }

    }

    public Press StopPrinting(long rollId, ArrayList<InfoPress> infoPresses,String subpartId)

    {
        System.out.println(subpartId);
        ArrayList<Press> presses = pressRepository.findAllByRollId(rollId);
        for (Press press:presses){
            for (ProductionPartInfo productionPartInfo: press.getProductionPartInfos()){
                if (productionPartInfo.getSubpart().getIdSubpart().equals(subpartId)){
                    productionPartInfo.getStationQties().get(0).setQtProduced(infoPresses.get(0).getQuantityProduced());

                    kafkaTemplate.send("PressToINVENTORY",press);
                    productionPartInfo.setStatus("PRODUCED");
                    press.setStatus("PRODUCED");
                    productionPartInfoRepository.save(productionPartInfo);
                    System.out.println(subpartId);
                    String url1 = "http://"+url + "/MACHINEANDSTATION-SERVICE/machineById/" + press.getMachineId();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        ResponseEntity<Machine> response = template.exchange(url1, HttpMethod.GET, new HttpEntity<Object>(headers), new ParameterizedTypeReference<Machine>() {
        });

        }}
            return pressRepository.save(press);

        }


        return null;
    }








  /*  if (pressRepository.findAll().size()!=0){
    for(Press press1 :pressRepository.findAll()){
        rolls.add(press1);
        press.setRolls(rolls);
    }
    }
    /*List<ProductionPartInfo> productionPartInfos=new ArrayList<>();
    press.setRollId(pressRepository.findAll().size()+1);
    Date date= Calendar.getInstance().getTime();
    press.setAcceptationDate((date));
    productionPartInfo.setAcceptationPress(press.getAcceptationDate());
     productionPartInfos.add(productionPartInfo);
     press.setProductionParts(productionPartInfos);
     roll
     */






public List<Roll>getReceivedRolls() {
    return rollRespository.findAll();
}
/*

public ProductionPartInfo sendToNextStation(String SubpartID) {
    ArrayList<StationQty> stations=new ArrayList<>();
 //   StationQty stationQty=new StationQty("PRESS",130,4,"Paper");
   // stations.add(stationQty);
    for(Press press :pressRepository.findAll())
   {
        if (press.getProductionParts().get(0).getSubpart().getIdSubpart().equals(SubpartID)){
             press.getProductionParts().get(0).setStationQties(stations);
              return press.getProductionParts().get(0);

        }
    }




    return null;
}


 */
public ArrayList<Subpart> getAllsubparts(){
    ArrayList<Subpart>subparts=new ArrayList<>();
    for (ProductionPartInfo productionPartInfo:productionPartInfoRepository.findAll()){
        subparts.add(productionPartInfo.getSubpart());


    }
    return subparts;
}
public ProductionPartInfo getSubpartsInfo(String IdSubpart){
        for (ProductionPartInfo productionPartInfo:productionPartInfoRepository.findAll()){
            if(productionPartInfo.getSubpart().getIdSubpart().equals(IdSubpart));
            return productionPartInfo;

        }
        return  null;
    }

    public ProductionPartInfo EndJob(String SubpartID){
    for (Press press:pressRepository.findAll()){
        for (ProductionPartInfo productionPartInfo: press.getProductionPartInfos()){
            if (productionPartInfo.getSubpart().getIdSubpart().equals(SubpartID)){
                productionPartInfo.getStationQties().get(0).setQtProduced(130);
                kafkaTemplate.send("PressToINVENTORY",press);
                productionPartInfo.setStatus("PRODUCED");
                press.setStatus("PRODUCED");
               return  productionPartInfoRepository.save(productionPartInfo);}}}

        return null;
    }

    public ArrayList<Press> getall() {
      return (ArrayList<Press>) pressRepository.findAllByStatus("SCHEDULED");
    }
    public ArrayList<Press> listeRollsByMachine(String machineId) {
        return pressRepository.findByMachineIdAndStatusOrderByOrdering(machineId, "ASSIGNED");
    }
    public Press currentRollOnProd(String machineId) {
        return pressRepository.findByMachineIdAndStatus(machineId, "ON PROD");
    }
    public ArrayList<Press> affecterMachineToRolls(String machineId, ArrayList<Long> rollIds,String mode)
    {
        {
            if(mode.equals("EPAC")) {
                ArrayList<Press> presses = pressRepository.findByMachineIdAndStatusOrderByOrdering(machineId, "ASSIGNED");
                long i = 1;
                int roll = 0;
                if (presses.size() > 0) {
                    i = presses.get(presses.size() - 1).getOrdering() + 1;
                }

                String url1 = "https://"+url + "/MACHINEANDSTATION-SERVICE/machineById/" + machineId;
                HttpHeaders headers = new HttpHeaders();
                headers.add("Accept", "application/json");
                ResponseEntity<Machine> response = template.exchange(url1, HttpMethod.GET, new HttpEntity<Object>(headers), new ParameterizedTypeReference<Machine>() {
                });
                Machine machine = (Machine) (response.getBody());
                boolean erreur = false;
                for (long rollId : rollIds) {
                    Press press = pressRepository.findByRollId(rollId);
                    for (PartInfo partInfo : press.getPartInfos()) {

                        if (erreur)
                            break;
                    }
                    if (!erreur) {
                        press.setMachineId(machineId);
                        press.setOrdering(i);
                        press.setStatus("ASSIGNED");
                        pressRepository.save(press);
                        i++;
                        roll++;
                    }
                }


                if (roll == 0)
                    return null;
                return pressRepository.findByMachineIdAndStatusOrderByOrdering(machineId, "ASSIGNED");
            }
            else
            {
                ArrayList<Press> presses = pressRepository.findByMachineIdAndStatusOrderByOrdering(machineId, "ASSIGNED");
                long i = 1;
                int roll = 0;
                if (presses.size() > 0) {
                    i = presses.get(presses.size() - 1).getOrdering() + 1;
                }

                boolean erreur = false;
                for (long rollId : rollIds) {
                    Press press = pressRepository.findByRollId(rollId);
                    String typeMachine="";

                    int seq=1;
                    for (PartInfo partInfo : press.getPartInfos())
                    {
                        for(ProductionPartInfo pr:press.getProductionPartInfos())
                        {






                                partInfo.setJobIdStandard(partInfo.getSmHeight() + "_PBSM" + pr.getPartId() + "R" + (int) press.getRollWidth() + "0");
                                partInfo.setNewJobId("R"+press.getRollId()+"_"+(int)Math.ceil((float)pr.getProductionPage()/(2*(float)pr.getImposition())*pr.getQtyRequested())+"_"+partInfo.getSmHeight()+"_"+seq);
                                System.out.println(partInfo.getJobId());
                                System.out.println(partInfo.getNewJobId());


                        }
                        seq++;




                        }




                    if (!erreur) {
                        press.setMachineId(machineId);
                        press.setOrdering(i);
                        press.setStatus("ASSIGNED");
                        pressRepository.save(press);
                        i++;
                        roll++;
                    }
                }


                if (roll == 0)
                    return null;
                return pressRepository.findByMachineIdAndStatusOrderByOrdering(machineId, "ASSIGNED");
            }
        }}

    public float durationscheduledrolls() {
        float duration=0;
        ArrayList<Press> presses=this.getall();
        for(Press press:presses)
            duration +=press.getDuration();
        return  duration;
    }


    public void RestartPrinting(long rollid) {
    }
}




