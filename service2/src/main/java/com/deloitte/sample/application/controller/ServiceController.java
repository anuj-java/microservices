package com.deloitte.sample.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akothiyal on 27/01/2017.
 */
@RestController
public class ServiceController {

    @RequestMapping("/")


    public Employer getPersonDetails(){
        return new Employer("-----Hello-----");
    }

    public class Employer {
        private String name;

        public Employer(String name) {
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
