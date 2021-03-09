# ConversionAPI
Conversion WebService

The Assessment

# Requirements

Write a service that will provide the following conversion:
* Kelvin to celsius
* Pounds to kilograms
* Miles to kilometers

Undertake the task as you normally would when doing development

###################################################################


The ConversionAPI is service capable of serving the following endpoints:


1. GET:  /conversions/ktocs/{kelvinunit}
      The ktoc endpoint should produce an output in Celsius when given an input amount in kelvin.
      
      The URL Example
     
     http://localhost:9595/conversions/ktocs/10
       
2. GET:   /conversions/ptokg/{poundsunit}
       The ptokg endpoint should produce, when given an input amount in miles, an output amount in kilometres.
       
       The URL Example
       
       http://localhost:9595/conversions/ptokg/100
       
3 .GET   /conversions/mtokm/{milesunit}
      The mtokm endpoint produce an out in Kilometres , when given an input in  miles
      
      The URL Example 
      
       http://localhost:9595/conversions/mtokm/2
