package com.deloitte.sample.application.repository;

import com.deloitte.sample.application.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by akothiyal on 02/03/2017.
 */
public interface CarRepository extends CrudRepository<Car, Long>{

   Car findByRegistrationNo(int registrationNo);

}
