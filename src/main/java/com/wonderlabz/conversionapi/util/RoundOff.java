/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wonderlabz.conversionapi.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
public class RoundOff {
    public static double roundoffDoubleTo2Dec(double kilo){
    
     BigDecimal bd = new BigDecimal(kilo).setScale(2, RoundingMode.HALF_UP);
        double kilogramsroundedoff = bd.doubleValue();
    return kilogramsroundedoff;
    
}
}
