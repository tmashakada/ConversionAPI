/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wonderlabz.conversionapi.model;

import java.io.Serializable;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
public class Conversion implements Serializable{
    private String unitofmeasurement;
    private double value;

    public Conversion() {
    }

    
    public Conversion(String unitofmeasurement, double value) {
        this.unitofmeasurement = unitofmeasurement;
        this.value = value;
    }

    
    
    public String getUnitofmeasurement() {
        return unitofmeasurement;
    }

    public void setUnitofmeasurement(String unitofmeasurement) {
        this.unitofmeasurement = unitofmeasurement;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
}
