package com.epac.Press.Controller;
import com.epac.Press.Entities.*;
import com.epac.Press.Entities.InfoPress;
import com.epac.Press.Service.PressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(value = "*")
public class PressController {
    @Autowired
    PressService pressService;
    @GetMapping ("/Allrolls")
    public ArrayList<Press> getall()
    {
        return  pressService.getall();
    }

    @GetMapping ("/EndJob/{subpartID}")
    public ProductionPartInfo sendToNextStation(@PathVariable String subpartID) {
       return  pressService.EndJob(subpartID);
    }
    @CrossOrigin("*")
    @GetMapping("/ScheduledHours")
    public float ScheduledHours()
    {
        return  pressService.durationscheduledrolls();
    }
    @CrossOrigin("*")
    @RequestMapping(value="/StartPrinting/{rollid}", method= RequestMethod.GET)
    public Press startPrinting(@PathVariable("rollid") final long rollid)
    {
        return pressService.StartPrintig(rollid);
    }

    @CrossOrigin("*")
    @RequestMapping(value="/PausePrinting/{rollid}", method= RequestMethod.GET)
    public Press pausePrinting(@PathVariable("rollid") final long rollid)
    {
        return pressService.pausePrinting(rollid);
    }
    @CrossOrigin("*")
    @RequestMapping(value="/RestartPrinting/{rollid}", method= RequestMethod.GET)
    public void restartPrinting(@PathVariable("rollid") final long rollid)
    {
        pressService.RestartPrinting(rollid);
    }

    @CrossOrigin("*")
    @PostMapping("/StopPrinting/{rollid}/{subpartId}")
    public Press   stopPrinting( @PathVariable("rollid") final long rollid,@RequestBody ArrayList<InfoPress>presses,@PathVariable("subpartId") final String subpartId)
    {
        return pressService.StopPrinting(rollid,presses,subpartId);
    }

    @CrossOrigin("*")
    @RequestMapping(value="/listesRollsByMachine/{machineId}", method= RequestMethod.GET)
    public ArrayList<Press> listesRollsByMachine(@PathVariable("machineId") final String machineId)
    {
        return pressService.listeRollsByMachine(machineId);
    }

    @CrossOrigin("*")
    @RequestMapping(value="/currentRollOnProd/{machineId}", method= RequestMethod.GET)
    public Press currentRollOnProd(@PathVariable("machineId") final String machineId)
    {
        return pressService.currentRollOnProd(machineId);
    }
    @CrossOrigin("*")
    @PostMapping("/affecterRollsToMachine/{machineId}/{mode}")
    public ResponseEntity<?> updateproducedShipping(@PathVariable("machineId") final String machineId, @RequestBody ArrayList<Long>rollIds,@PathVariable("mode") final String mode)
    {
        ArrayList<Press>presses= pressService.affecterMachineToRolls(machineId,rollIds,mode);
        if(presses==null)
            return new ResponseEntity<>("Please check Rasters Files ! ", HttpStatus.BAD_REQUEST);

        return ResponseEntity.ok(presses);

    }
    @CrossOrigin("*")
    @RequestMapping(value="/dissociateRoll/{machineId}/{rollid}", method= RequestMethod.GET)
    public ArrayList<Press> dissociateRoll(@PathVariable("machineId") final String machineId,@PathVariable("rollid") final long rollid)
    {
        return pressService.dissociateRoll(machineId,rollid);
    }



}
