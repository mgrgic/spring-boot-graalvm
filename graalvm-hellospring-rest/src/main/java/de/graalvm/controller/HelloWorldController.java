package de.graalvm.controller;

import de.graalvm.entity.LombokEntity;
import de.graalvm.entity.SimpleEntity;
import de.graalvm.entity.SimpleSerializedEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> getWorld() {
        return ResponseEntity.ok().body("world");
    }

    @RequestMapping(value = "/lombok", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<LombokEntity> getLombok() {
        return ResponseEntity.ok(LombokEntity.builder().foo("foo").isBar(true).build());
    }

    @RequestMapping(value = "/pojo", produces = "application/json")
    public ResponseEntity<SimpleEntity> getPojo() {
        SimpleEntity simpleEntity = new SimpleEntity();
        simpleEntity.setBar(true);
        simpleEntity.setFoo("foo");
        return ResponseEntity.ok(simpleEntity);
    }

    @RequestMapping(value = "/serialized", produces = "application/json")
    public ResponseEntity<SimpleSerializedEntity> getSerialized() {
        SimpleSerializedEntity simpleSerializedEntity = new SimpleSerializedEntity();
        simpleSerializedEntity.setBar(true);
        simpleSerializedEntity.setFoo("foo");
        return ResponseEntity.ok(simpleSerializedEntity);
    }

    @RequestMapping(value = "/simplemap", produces = "application/json")
    public ResponseEntity<Map> getSimpleMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");

        return ResponseEntity.ok(map);
    }

    @RequestMapping(value = "/map", produces = "application/json")
    public ResponseEntity<Map> getMap() {
        Map<Integer, SimpleSerializedEntity> map = new HashMap<>();

        SimpleSerializedEntity simpleSerializedEntity = new SimpleSerializedEntity();
        simpleSerializedEntity.setBar(true);
        simpleSerializedEntity.setFoo("foo");
        map.put(1, simpleSerializedEntity);

        SimpleSerializedEntity simpleSerializedEntity2 = new SimpleSerializedEntity();
        simpleSerializedEntity2.setBar(false);
        simpleSerializedEntity2.setFoo("fu");
        map.put(2, simpleSerializedEntity2);

        return ResponseEntity.ok(map);
    }
}
