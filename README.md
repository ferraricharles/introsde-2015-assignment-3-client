# Assignment 3 INTROSDE 2015 - CLIENT

[Educational porpouses only]

This is the development of the third assignment given on the Introduction to Service Design Engineering course at University of Trento during Computer Science MSC.

The basic function is to use the service described below.

### Important Links 

* [The Server on Heroku] [1]
* [The Server code][2]

### Instructions for the Server
 * Git clone the folder to your machine
 * Make sure you have ant installed
 * Go to the folder and in your terminal, type down ant execute.client
 
####How it works:
 
 It will execute the client testing all server functions using WSDL. The tried functions are:
 
 * readPersonList()
 * readPerson(Long id)
 * updatePerson(Person p) 
 * createPerson(Person p)
 * deletePersonById(Long id) 
 * readPersonHistory(Long id, String measureType)
 * readMeasureTypes()
 * readPersonMeasure(Long id, String measureType, Long mid)
 * savePersonMeasure(Long id, Measure m) 
 * updatePersonMeasure(Long id, Measure m)
  
### Extra information
The [Client log][3] gives an instance of the logs of client runing.
    
[1]: https://frozen-shore-6890.herokuapp.com/ws/people?wsdl
[2]: https://github.com/ferraricharles/introsde-2015-assignment-3
[3]: https://github.com/ferraricharles/introsde-2015-assignment-3-client/blob/master/client.log
