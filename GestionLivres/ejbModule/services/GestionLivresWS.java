package services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entites.Auteur;
import entites.Livre;
import session.GestionLivreBeanLocal;

@Stateless
@WebService
public class GestionLivresWS {
	@EJB
	private GestionLivreBeanLocal gestion;
	@WebMethod
	public void
	ajouterLivre(@WebParam(name="intitulé")String intitule,
	@WebParam(name="auteurs") List<Auteur> auteurs){
	 Livre livre=new Livre(intitule,auteurs) ;
	gestion.ajouterLivre(livre);
	};
	@WebMethod
	public List<Livre> listerTousLesLivres(){
	return gestion.ListerTousLesLivres();
	};

}
