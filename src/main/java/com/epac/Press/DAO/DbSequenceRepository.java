package com.epac.Press.DAO;

import com.epac.Press.NotEntities.DbSequence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DbSequenceRepository extends MongoRepository<DbSequence,Long> {
    DbSequence findByLd(String ld);
}
