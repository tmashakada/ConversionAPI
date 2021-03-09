/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wonderlabz.conversionapi.service;

import com.wonderlabz.conversionapi.model.Conversion;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
public interface ConversionService {
     Conversion kelvinToCelsius(double kelvin);
     Conversion poundsToKilograms(double pounds);

     Conversion milesToKiloMeters(double miles);

}
