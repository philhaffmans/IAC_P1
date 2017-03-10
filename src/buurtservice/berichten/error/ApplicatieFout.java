
package buurtservice.berichten.error;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foutmelding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "foutmelding"
})
@XmlRootElement(name = "ApplicatieFout")
public class ApplicatieFout {

    @XmlElement(required = true)
    protected String foutmelding;

    /**
     * Gets the value of the foutmelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoutmelding() {
        return foutmelding;
    }

    /**
     * Sets the value of the foutmelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoutmelding(String value) {
        this.foutmelding = value;
    }

}
