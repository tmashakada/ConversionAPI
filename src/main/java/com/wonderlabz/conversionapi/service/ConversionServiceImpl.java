/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wonderlabz.conversionapi.service;

import com.wonderlabz.conversionapi.model.Conversion;
import com.wonderlabz.conversionapi.util.RoundOff;
import org.springframework.stereotype.Service;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
@Service
public class ConversionServiceImpl implements ConversionService{
    
public static final double KELVINTOCELSIUSCONST = 273.15;
    public static final double MILETOKILOMETERCONST = 1.60934;
    public static final double POUNDSTOKILOGRAMSCONST = 0.454;
    
    
    @Override
    public Conversion kelvinToCelsius(double kelvin) {
      
     double celsius = kelvin - KELVINTOCELSIUSCONST;
    
     double celsiusroundedoff = RoundOff.roundoffDoubleTo2Dec(celsius );
     Conversion  conversion=new Conversion();
     conversion.setUnitofmeasurement("Celsius");
     conversion.setValue(celsiusroundedoff);
        return  conversion;
    
    }

    @Override
    public Conversion poundsToKilograms(double pounds) {
       double kilograms = pounds * POUNDSTOKILOGRAMSCONST;
     
       double kilogramsroundedoff = RoundOff.roundoffDoubleTo2Dec(kilograms );
       Conversion  conversion=new Conversion();
       conversion.setUnitofmeasurement("kilograms");
       conversion.setValue(kilogramsroundedoff);
        return  conversion;
    }

    @Override
    public Conversion milesToKiloMeters(double miles) {
      
      double kilometers=miles * MILETOKILOMETERCONST;
       
       double kilogramsroundedoff = RoundOff.roundoffDoubleTo2Dec(kilometers );
       Conversion  conversion=new Conversion();
       conversion.setUnitofmeasurement("Kilometers");
       conversion.setValue(kilogramsroundedoff);
        return conversion;
    }
    
}
