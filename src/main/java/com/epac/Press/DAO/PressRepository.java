package com.epac.Press.DAO;
import com.epac.Press.Entities.Press;
import com.epac.Press.Entities.ProductionPartInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PressRepository extends MongoRepository<Press,Long>
{
    ArrayList<Press> findByMachineIdAndStatusOrderByOrdering(String machineId, String assigned);

    Press findByMachineIdAndStatus(String machineId, String on_prod);
    ArrayList<Press> findAllByRollId(long rollId);
    ArrayList<Press> findAllByStatus(String status);

    Press findByRollId(long rollId);
    //Press findByJobId(String JobId);
    Press findByPartInfos(ProductionPartInfo productionPartInfo);
}
