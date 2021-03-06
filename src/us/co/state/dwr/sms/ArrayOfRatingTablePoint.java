
package us.co.state.dwr.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRatingTablePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatingTablePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatingTablePoint" type="{http://www.dwr.state.co.us/}RatingTablePoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatingTablePoint", propOrder = {
    "ratingTablePoint"
})
public class ArrayOfRatingTablePoint {

    @XmlElement(name = "RatingTablePoint", nillable = true)
    protected List<RatingTablePoint> ratingTablePoint;

    /**
     * Gets the value of the ratingTablePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingTablePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingTablePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingTablePoint }
     * 
     * 
     */
    public List<RatingTablePoint> getRatingTablePoint() {
        if (ratingTablePoint == null) {
            ratingTablePoint = new ArrayList<RatingTablePoint>();
        }
        return this.ratingTablePoint;
    }

}
