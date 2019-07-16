
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AjouterLivreResponse_QNAME = new QName("http://services/", "ajouterLivreResponse");
    private final static QName _AjouterLivre_QNAME = new QName("http://services/", "ajouterLivre");
    private final static QName _ListerTousLesLivresResponse_QNAME = new QName("http://services/", "listerTousLesLivresResponse");
    private final static QName _ListerTousLesLivres_QNAME = new QName("http://services/", "listerTousLesLivres");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListerTousLesLivres }
     * 
     */
    public ListerTousLesLivres createListerTousLesLivres() {
        return new ListerTousLesLivres();
    }

    /**
     * Create an instance of {@link AjouterLivreResponse }
     * 
     */
    public AjouterLivreResponse createAjouterLivreResponse() {
        return new AjouterLivreResponse();
    }

    /**
     * Create an instance of {@link AjouterLivre }
     * 
     */
    public AjouterLivre createAjouterLivre() {
        return new AjouterLivre();
    }

    /**
     * Create an instance of {@link ListerTousLesLivresResponse }
     * 
     */
    public ListerTousLesLivresResponse createListerTousLesLivresResponse() {
        return new ListerTousLesLivresResponse();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ajouterLivreResponse")
    public JAXBElement<AjouterLivreResponse> createAjouterLivreResponse(AjouterLivreResponse value) {
        return new JAXBElement<AjouterLivreResponse>(_AjouterLivreResponse_QNAME, AjouterLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ajouterLivre")
    public JAXBElement<AjouterLivre> createAjouterLivre(AjouterLivre value) {
        return new JAXBElement<AjouterLivre>(_AjouterLivre_QNAME, AjouterLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerTousLesLivresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listerTousLesLivresResponse")
    public JAXBElement<ListerTousLesLivresResponse> createListerTousLesLivresResponse(ListerTousLesLivresResponse value) {
        return new JAXBElement<ListerTousLesLivresResponse>(_ListerTousLesLivresResponse_QNAME, ListerTousLesLivresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerTousLesLivres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listerTousLesLivres")
    public JAXBElement<ListerTousLesLivres> createListerTousLesLivres(ListerTousLesLivres value) {
        return new JAXBElement<ListerTousLesLivres>(_ListerTousLesLivres_QNAME, ListerTousLesLivres.class, null, value);
    }

}
