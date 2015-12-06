package introsde.assignment.soap.ws;

import introsde.assignment.soap.ws.LifeStatus;
import introsde.assignment.soap.ws.MeasureDefinition;
import introsde.assignment.soap.ws.Person;
import introsde.assignment.soap.ws.People;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class PeopleClient{
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://frozen-shore-6890.herokuapp.com/ws/people?wsdl");
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.soap.assignment.introsde/", "PeopleService");
        Service service = Service.create(url, qname);
        
        People people = service.getPort(People.class);
        // read person with id 1
        
        System.out.println("\n\n ########## ##########");
        System.out.println("CONNECTED TO "+url);
        
        System.out.println("\n\n ### Method #1");
        System.out.println("Calling  readPersonList()");
        
        List<Person> pList = people.readPersonList();
        System.out.println("Geting result list ==> "+pList.size()+" persons found");
        Person p = people.readPerson(2);
        
        List<LifeStatus> pls = p.getLifeStatus();
        LifeStatus oLs = pls.get(pls.size()-1);
        
        
        System.out.println("\n\n ### Method #2");
        System.out.println("Calling  readPerson([id = 2])");
        System.out.println("Method #2: Reading Person id = 2 ==> "
        		+ " Full Name: "+p.getFirstname()+" "+p.getLastname()+""
        				+ " Birthday: "+p.getBirthdate()
        		+ " Last Measure was in= "+oLs.getCreatedDate()+""
        				+ " Measure: "+oLs.getMeasureType()+" value "+oLs.getValue() );
        
        
       
        // change name of the person with id 1
        String uuid = UUID.randomUUID().toString();
        p.setFirstname("John"+uuid);
        
        people.updatePerson(p);
        // read again this person
        p = people.readPerson(2);
        System.out.println("\n\n ### Method #3");
        System.out.println("Calling  updatePerson([Person = objectPerson with new FIrst Name =  John"+uuid+"])");
        System.out.println("New first name from the Server ==> "+p.getFirstname());
        
        MeasureDefinition md = people.getSingleMeasureType(1);
        LifeStatus pLs = new LifeStatus();
        
        pLs.setMeasureType("weight");;
        pLs.setValue(120+"");
        List<LifeStatus> lsList = new ArrayList<LifeStatus>();
        
        lsList.add(pLs);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Person p2 = new Person();
        
        //p2.setBirthdate(formatter.parse("05/03/1990"));
        //p2.setEmail("down@johnes.com");
        p2.setLastname("Santos");
        p2.setFirstname("Bigode");
        //p2.setHealthProfile(lsList);
        //p2.setLifeStatus(lsList);
        
        long idPerson = people.createPerson(p2);
        
        p = people.readPerson(idPerson);
        
        System.out.println("\n\n ### Method #4");
        System.out.println("Calling  createPerson([Person = {last name = Santos, First Name = Bigode, (Object) HealthProfile = weight 120 }]");
        
        System.out.println("Method #4 Person added ==> ID: "+idPerson);
        
        
       // = people.deletePerson( );
        long i = people.deletePersonById(idPerson);
        p = people.readPerson(idPerson);
       
        
        if (i==1){
        	System.out.println("\n\n ### Method #5");
        	System.out.println("Calling  deletePerson("+idPerson+")");
        	System.out.println("Method #5 Person deleted, old ID = "+idPerson );
        }
       
        
        p = people.readPerson(2);
        String measureType = "weight";
        List<LifeStatus> ls = people.getMeasureType(p.getIdPerson(), measureType);
        
        System.out.println("\n\n ### Method #6");
        System.out.println("Calling  getMeasureType(id = "+p.getIdPerson()+", measureType = "+measureType+")");
        System.out.println("Method #6 List for person id="+p.getIdPerson()+" and measureType = "+measureType+"  returned = "+ls.size()+" results" );
        
        List <MeasureDefinition> mds = people.readMeasureTypes();
        System.out.println("\n\n ### Method #7");
        System.out.println("Calling  readMeasureTypes()");
        System.out.println("The method found "+mds.size()+" different measure definitions");
        
        try{
        	 LifeStatus ls1 = ls.get(0);
        	 ls1 = people.readLifeStatus(ls1.getMid());
        	 
     		 
             LifeStatus ls2 = people.readPersonMeasure(p.getIdPerson(), measureType, ls1.getMid());
             System.out.println("\n\n ### Method #8");
             System.out.println("Calling  readMeasureTypes(id="+p.getIdPerson()+",measureType = "+measureType+", measureId = "+ls1.getMid()+"  )");
             System.out.println("Method #8 Received from person id="+p.getIdPerson()+" "
             		+ "Measure Type = "+measureType +""
             				+ " Measure Id = "+ls1.getMid());
        }catch(Exception e){
        	System.out.println(e);
        	
        }
        
        LifeStatus newLs = new LifeStatus();
        newLs.setMeasureType("weight");
        //newLs.setMeasureDefinition(mds.get(0));
        newLs.setValue(120+"");
        newLs = people.savePersonMeasure(p.getIdPerson(), newLs);
        System.out.println("\n\n ### Method #9");
        System.out.println("Calling  savePersonMeasure(id = "+p.getIdPerson()+", new Measure Object(weight, value 120)");
        System.out.println("Method #9 new Measure stored for "
        		+ "person "+p.getIdPerson()+" "
        				+ "measure = "+mds.get(0).getMeasureName()+" "
        						+ "value = "+newLs.getValue()  );
       
        
        newLs.setValue(150+"");
        
        newLs = people.updatePersonMeasure(p.getIdPerson(), newLs);
        System.out.println("\n\n ### Method #10");
        System.out.println("Calling  updatePersonMeasure(id = "+p.getIdPerson()+",  new Measure Object(weight, value 150))");
        System.out.println("Method #10 updating Measure for "
        		+ "person "+p.getIdPerson()+" "
        				+ "measure = "+mds.get(0).getMeasureName()+" "
        						+ "value = "+newLs.getValue()  );
        		
        
    }
}
