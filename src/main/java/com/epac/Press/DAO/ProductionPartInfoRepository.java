package com.epac.Press.DAO;

import com.epac.Press.Entities.ProductionPartInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionPartInfoRepository extends MongoRepository<ProductionPartInfo,Long>
{
    ProductionPartInfo findByProductionPartId(Long ProductionPartId);
    ProductionPartInfo findBySubpart_IdSubpart(String  IdSubpart);
}
