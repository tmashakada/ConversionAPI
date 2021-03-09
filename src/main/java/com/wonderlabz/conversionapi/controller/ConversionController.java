/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wonderlabz.conversionapi.controller;

import com.wonderlabz.conversionapi.model.Conversion;
import com.wonderlabz.conversionapi.service.ConversionService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */

@RestController
@RequestMapping("/conversions")
public class ConversionController {
    @Autowired
   private ConversionService conversionService;
   @GetMapping(value = "/ktocs/{kelvinunit}")
  public  ResponseEntity<Conversion> convertKelvinToCelsius2(@Valid @PathVariable("kelvinunit")  Double kelvinunit) {
   
      
     
        return new ResponseEntity<>(conversionService.kelvinToCelsius(kelvinunit), HttpStatus.OK);
      
    }
  @GetMapping(value = "/ptokg/{poundsunit}") 
  public  ResponseEntity<Conversion> convertPoundsToKilograms(@Valid @PathVariable("poundsunit")  Double pounds) {
        
        
        return new ResponseEntity<>(conversionService.poundsToKilograms(pounds), HttpStatus.OK);
        
    }
  @GetMapping(value = "/ktokm/{milesunit}") 
  public  ResponseEntity<Conversion> convertMilesKilometers(@Valid @PathVariable("milesunit")  Double miles) {
        
        
        return new ResponseEntity<>(conversionService.milesToKiloMeters(miles), HttpStatus.OK);
        
    }
}
