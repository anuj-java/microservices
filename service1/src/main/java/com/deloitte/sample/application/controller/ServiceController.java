package com.deloitte.sample.application.controller;

import com.deloitte.sample.application.Address;
import com.deloitte.sample.application.Employee;
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
        return ("Hello "+ name);
    }

    /**
     * Below end point allows content negotiation and can return an xml,
     * json or a binary protobuf object.
     * <pre>
     *     {@code
     *     Accept: application/xml, application/json, application/x-protobuf
     *     }
     * </pre>
     * @return
     */
    @RequestMapping(path = "/protobuf", method = RequestMethod.GET)
    public Employee getProtoBufSampleDetails(){

       return Employee.newBuilder().setName("Anuj").
               setAddress(Address.newBuilder().setFlatNumber(116).setStreetName("UxBridge Road")).build();

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
