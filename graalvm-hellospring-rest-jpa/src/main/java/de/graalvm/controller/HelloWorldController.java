package de.graalvm.controller;

import de.graalvm.entity.SimpleEntity;
import de.graalvm.repository.EntityRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

    final EntityRepository entityRepository;

    public HelloWorldController(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @RequestMapping(value = "/entity")
    public ResponseEntity<List<SimpleEntity>> getAllEntities() {
        List<SimpleEntity> entities = entityRepository.findAll();
        return ResponseEntity.ok(entities);
    }

    @RequestMapping(value = "/entity/{id}")
    public ResponseEntity<Optional<SimpleEntity>> getEntityById(
            @PathVariable Integer id
    ) {
        Optional<SimpleEntity> entity = entityRepository.findById(id);
        return ResponseEntity.ok(entity);
    }

    @PostMapping(value = "/entity")
    public ResponseEntity<SimpleEntity> createEntity(
            @RequestBody SimpleEntity entity
    ) {
        SimpleEntity createdEntity = entityRepository.save(entity);
        return ResponseEntity.ok(createdEntity);
    }

}
