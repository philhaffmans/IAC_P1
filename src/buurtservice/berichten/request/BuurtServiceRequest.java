
package buurtservice.berichten.request;

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
 *         &lt;element name="Jaar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Wijk" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "jaar",
    "wijk"
})
@XmlRootElement(name = "BuurtService-request")
public class BuurtServiceRequest {

    @XmlElement(name = "Jaar")
    protected int jaar;
    @XmlElement(name = "Wijk", required = true)
    protected String wijk;

    /**
     * Gets the value of the jaar property.
     * 
     */
    public int getJaar() {
        return jaar;
    }

    /**
     * Sets the value of the jaar property.
     * 
     */
    public void setJaar(int value) {
        this.jaar = value;
    }

    /**
     * Gets the value of the wijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWijk() {
        return wijk;
    }

    /**
     * Sets the value of the wijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWijk(String value) {
        this.wijk = value;
    }

}
