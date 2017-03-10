package buurtservice.berichten;

import buurtservice.berichten.error.*;
import buurtservice.berichten.request.BuurtServiceRequest;
import buurtservice.berichten.response.ObjectFactory;
import buurtservice.berichten.response.BuurtServiceResponse;
import com.sun.xml.ws.developer.SchemaValidation;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by philippehaffmans on 10-03-17.
 */
@WebService(endpointInterface = "buurtservice.berichten.WSInterface")
@SchemaValidation(handler = BuurtServiceValidationHandler.class)
public class BuurtService implements WSInterface {
    @Override
    public BuurtServiceResponse getInwoners(BuurtServiceRequest parameters) throws ApplicatieFout {
        ObjectFactory factory = new ObjectFactory();
        BuurtServiceResponse response = factory.createBuurtServiceResponse();
        try{
            if (parameters.getWijk() == null || parameters.getJaar() == 0){
                throw new RuntimeException();
            }
            Inwoners.initInwoners();
            int uitkomst = Inwoners.searchInwoners(parameters.getWijk(), parameters.getJaar());
            response.setAantal(uitkomst);
        }catch (RuntimeException e){
            buurtservice.berichten.error.ObjectFactory errorfactory = new buurtservice.berichten.error.ObjectFactory();
            buurtservice.berichten.error.ApplicatieFout x = errorfactory.createApplicatieFout();
            x.setFoutmelding("Aantal bewoners kan niet worden gevonden!");
            ApplicatieFout fault = new ApplicatieFout("Aantal bewoners kan niet worden gevonden!", x);
            throw fault;
        }
        return response;
    }
}
