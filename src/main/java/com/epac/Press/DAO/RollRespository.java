package com.epac.Press.DAO;

import com.epac.Press.Entities.Roll;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RollRespository extends MongoRepository<Roll,Long> {

}
