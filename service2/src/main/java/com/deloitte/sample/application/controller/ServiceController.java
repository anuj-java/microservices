package com.deloitte.sample.application.controller;

import com.deloitte.sample.application.model.Car;
import com.deloitte.sample.application.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by akothiyal on 27/01/2017.
 *
 * This application is protected by Spring security just by providing spring security
 * jar in the class path which enables spring boot to enable security
 */
@RestController
public class ServiceController {

    @Autowired
    CarService carService;

    @RequestMapping("/")
    public Employer getPersonDetails(@RequestParam(name = "name",  defaultValue = "AK") String name){
        return new Employer(name);
    }

    @RequestMapping(path = "/cars/{registrationNo}", method = RequestMethod.GET)
    public Car getCar(@PathVariable(value = "registrationNo") int registrationNo){
        return carService.getCarInformation(registrationNo);
    }

    @RequestMapping(path = "/cars", method = RequestMethod.GET)
    public List<Car> getCars(){
        return carService.getCars();
    }

    @RequestMapping(path = "/cars/add",method = RequestMethod.POST)
    public Long addCarInfo(@RequestBody Car car){

        return carService.addCarInformation(car);
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
