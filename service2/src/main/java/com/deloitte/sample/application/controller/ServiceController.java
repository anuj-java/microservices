package com.deloitte.sample.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akothiyal on 27/01/2017.
 *
 * This application is protected by Spring security just by providing spring security
 * jar in the class path which enables spring boot to enable security
 */
@RestController
public class ServiceController {

    @RequestMapping("/")
    public Employer getPersonDetails(@RequestParam(name = "name",  defaultValue = "AK") String name){
        return new Employer(name);
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
