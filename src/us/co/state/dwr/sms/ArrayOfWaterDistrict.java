
package us.co.state.dwr.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWaterDistrict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWaterDistrict">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WaterDistrict" type="{http://www.dwr.state.co.us/}WaterDistrict" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWaterDistrict", propOrder = {
    "waterDistrict"
})
public class ArrayOfWaterDistrict {

    @XmlElement(name = "WaterDistrict", nillable = true)
    protected List<WaterDistrict> waterDistrict;

    /**
     * Gets the value of the waterDistrict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterDistrict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaterDistrict }
     * 
     * 
     */
    public List<WaterDistrict> getWaterDistrict() {
        if (waterDistrict == null) {
            waterDistrict = new ArrayList<WaterDistrict>();
        }
        return this.waterDistrict;
    }

}
