
package services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ajouterLivre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ajouterLivre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intitulé" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auteurs" type="{http://services/}auteur" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ajouterLivre", propOrder = {
    "intitul\u00e9",
    "auteurs"
})
public class AjouterLivre {

    protected String intitulé;
    protected List<Auteur> auteurs;

    /**
     * Obtient la valeur de la propriété intitulé.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntitulé() {
        return intitulé;
    }

    /**
     * Définit la valeur de la propriété intitulé.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntitulé(String value) {
        this.intitulé = value;
    }

    /**
     * Gets the value of the auteurs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auteurs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuteurs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Auteur }
     * 
     * 
     */
    public List<Auteur> getAuteurs() {
        if (auteurs == null) {
            auteurs = new ArrayList<Auteur>();
        }
        return this.auteurs;
    }

}
