package de.graalvm.repository;


import de.graalvm.entity.SimpleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntityRepository extends MongoRepository<SimpleEntity, Integer> {

    public SimpleEntity findByIsBar(Boolean isBar);

}
