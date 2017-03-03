package com.deloitte.sample.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by akothiyal on 02/03/2017.
 */
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int registrationNo ;
    private String modelName;
    private boolean isElectric;

    public long getId() {
        return id;
    }

    public Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", registrationNo=" + registrationNo +
                ", modelName='" + modelName + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

    public Car(int registrationNo, String modelName, boolean isElectric) {
        this.registrationNo = registrationNo;
        this.modelName = modelName;
        this.isElectric = isElectric;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public int getRegistrationNo() {

        return registrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }
}
