package com.deloitte.sample.application.service;

import com.deloitte.sample.application.model.Car;
import com.deloitte.sample.application.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akothiyal on 02/03/2017.
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;

    @Override
    public Car getCarInformation(int registrationNumber) {
        return carRepository.findByRegistrationNo(registrationNumber);
    }

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();

        carRepository.findAll().forEach(car  -> cars.add(car));

        return cars;
    }

    @Override
    public Long addCarInformation(Car car) {
        return carRepository.save(car).getId();
    }

}
