package com.javamind.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Guillaume EHRET
 */
@RestController
public class MyController {

    @RequestMapping("/hello/{name}")
    public String listEnv(@PathVariable String name) {

        return "Hello man " + name;
    }
}
