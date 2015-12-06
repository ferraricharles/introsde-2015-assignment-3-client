
package introsde.assignment.soap.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.soap.assignment.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment.soap.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonListResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readPersonListRequest", output = "http://ws.soap.assignment.introsde/People/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.assignment.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readPersonRequest", output = "http://ws.soap.assignment.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param person
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.CreatePersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/createPersonRequest", output = "http://ws.soap.assignment.introsde/People/createPersonResponse")
    public long createPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/updatePersonRequest", output = "http://ws.soap.assignment.introsde/People/updatePersonResponse")
    public long updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeletePersonResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/deletePersonRequest", output = "http://ws.soap.assignment.introsde/People/deletePersonResponse")
    public void deletePerson(
        @WebParam(name = "personId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Long> personId);

    /**
     * 
     * @param personId
     * @param healthProfile
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHealthProfile", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonHealthProfile")
    @ResponseWrapper(localName = "updatePersonHealthProfileResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonHealthProfileResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/updatePersonHealthProfileRequest", output = "http://ws.soap.assignment.introsde/People/updatePersonHealthProfileResponse")
    public int updatePersonHealthProfile(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "healthProfile", targetNamespace = "")
        LifeStatus healthProfile);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns java.util.List<introsde.assignment.soap.ws.LifeStatus>
     */
    @WebMethod
    @WebResult(name = "measureType", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureType", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetMeasureType")
    @ResponseWrapper(localName = "getMeasureTypeResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetMeasureTypeResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/getMeasureTypeRequest", output = "http://ws.soap.assignment.introsde/People/getMeasureTypeResponse")
    public List<LifeStatus> getMeasureType(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        String measure);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment.soap.ws.MeasureDefinition>
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadMeasureTypesResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readMeasureTypesRequest", output = "http://ws.soap.assignment.introsde/People/readMeasureTypesResponse")
    public List<MeasureDefinition> readMeasureTypes();

    /**
     * 
     * @param measureId
     * @param measure
     * @param personId
     * @return
     *     returns introsde.assignment.soap.ws.LifeStatus
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonMeasureResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readPersonMeasureRequest", output = "http://ws.soap.assignment.introsde/People/readPersonMeasureResponse")
    public LifeStatus readPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        String measure,
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.assignment.soap.ws.LifeStatus
     */
    @WebMethod
    @WebResult(name = "readLifeStatus", targetNamespace = "")
    @RequestWrapper(localName = "readLifeStatus", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadLifeStatus")
    @ResponseWrapper(localName = "readLifeStatusResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadLifeStatusResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readLifeStatusRequest", output = "http://ws.soap.assignment.introsde/People/readLifeStatusResponse")
    public LifeStatus readLifeStatus(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param idLifeStatus
     * @return
     *     returns introsde.assignment.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "readPersonFromLifeStatus", targetNamespace = "")
    @RequestWrapper(localName = "readPersonFromLifeStatus", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonFromLifeStatus")
    @ResponseWrapper(localName = "readPersonFromLifeStatusResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.ReadPersonFromLifeStatusResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/readPersonFromLifeStatusRequest", output = "http://ws.soap.assignment.introsde/People/readPersonFromLifeStatusResponse")
    public Person readPersonFromLifeStatus(
        @WebParam(name = "idLifeStatus", targetNamespace = "")
        int idLifeStatus);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns introsde.assignment.soap.ws.LifeStatus
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/savePersonMeasureRequest", output = "http://ws.soap.assignment.introsde/People/savePersonMeasureResponse")
    public LifeStatus savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        LifeStatus measure);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns introsde.assignment.soap.ws.LifeStatus
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.UpdatePersonMeasureResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/updatePersonMeasureRequest", output = "http://ws.soap.assignment.introsde/People/updatePersonMeasureResponse")
    public LifeStatus updatePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        LifeStatus measure);

    /**
     * 
     * @param measureId
     * @return
     *     returns introsde.assignment.soap.ws.MeasureDefinition
     */
    @WebMethod
    @WebResult(name = "measureType", targetNamespace = "")
    @RequestWrapper(localName = "getSingleMeasureType", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetSingleMeasureType")
    @ResponseWrapper(localName = "getSingleMeasureTypeResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.GetSingleMeasureTypeResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/getSingleMeasureTypeRequest", output = "http://ws.soap.assignment.introsde/People/getSingleMeasureTypeResponse")
    public MeasureDefinition getSingleMeasureType(
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param person
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "deletePersonById", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeletePersonById")
    @ResponseWrapper(localName = "deletePersonByIdResponse", targetNamespace = "http://ws.soap.assignment.introsde/", className = "introsde.assignment.soap.ws.DeletePersonByIdResponse")
    @Action(input = "http://ws.soap.assignment.introsde/People/deletePersonByIdRequest", output = "http://ws.soap.assignment.introsde/People/deletePersonByIdResponse")
    public long deletePersonById(
        @WebParam(name = "person", targetNamespace = "")
        long person);

}
