package com.deloitte.sample.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akothiyal on 27/01/2017.
 */
@RestController
public class ServiceController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getPersonDetails(@RequestParam(name = "name", defaultValue = "Joe") String name){
        return ("-----Hello-----"+ name);
    }

    public class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
