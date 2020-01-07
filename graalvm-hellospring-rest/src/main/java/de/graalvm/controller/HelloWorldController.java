package de.graalvm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

    @RequestMapping(value = "/hello") //, method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok().body("world");
    }
}
