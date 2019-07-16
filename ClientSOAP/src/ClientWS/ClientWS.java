package ClientWS;

import java.util.ArrayList;
import java.util.List;

import services.Auteur;
import services.GestionLivresWS;
import services.GestionLivresWSService;
import services.Livre;

public class ClientWS {
	public static void main(String[] args) {
		GestionLivresWS gestion=new GestionLivresWSService().getGestionLivresWSPort();//création d’un proxy du Web service
		List<Auteur> auteurs= new ArrayList<Auteur>();
		Auteur a1 = new Auteur();
		a1.setId("1235");
		a1.setNom("Sofiane");
		auteurs.add(a1);
		//créer les instances Auteur
		gestion.ajouterLivre("Java",auteurs);
		gestion.listerTousLesLivres();
		List<Livre> livres=gestion.listerTousLesLivres();
		for (Livre lv:livres){
		System.out.println(lv.getIntitule());
		}
		}

}
