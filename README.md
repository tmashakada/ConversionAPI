# ConversionAPI
Conversion WebService

The Assessment

# Requirements

Write a service that will provide the following conversion:
* Kelvin to celsius
* Pounds to kilograms
* Miles to kilometers

Undertake the task as you normally would when doing development

############################################################################
The ConversionAPI is service capable of serving the following endpoints:


 GET:  /conversions/ktocs/{kelvinunit}
      The ktoc endpoint should produce an output in Celsius when given an input amount in kelvin.
	  for Example
       http://localhost:9595/conversions/ktocs/10
 GET:   /conversions/ptokg/{poundsunit}
       The ptokg endpoint should produce, when given an input amount in miles, an output amount in kilometres.
	   For Example 
       http://localhost:9595/conversions/ptokg/100
GET   /conversions/mtokm/{milesunit}
      The mtokm endpoint produce an out in Kilometres , when given an input in  miles
      For Example 
       http://localhost:9595/conversions/mtokm/2
