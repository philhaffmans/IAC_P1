
package buurtservice.berichten;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ApplicatieFout", targetNamespace = "http://buurtservice/berichten/error")
public class ApplicatieFout
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private buurtservice.berichten.error.ApplicatieFout faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ApplicatieFout(String message, buurtservice.berichten.error.ApplicatieFout faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ApplicatieFout(String message, buurtservice.berichten.error.ApplicatieFout faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: buurtservice.berichten.error.ApplicatieFout
     */
    public buurtservice.berichten.error.ApplicatieFout getFaultInfo() {
        return faultInfo;
    }

}
