package com.deloitte.sample.application.service;

import com.deloitte.sample.application.model.Car;

import java.util.List;

/**
 * Created by akothiyal on 02/03/2017.
 */
public interface CarService {

    Car getCarInformation(int registrationNumber);

    List<Car> getCars();

    Long addCarInformation(Car car);
}
