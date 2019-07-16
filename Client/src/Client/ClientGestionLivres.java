package Client;

import java.util.Properties;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entites.Auteur;
import entites.Livre;
import session.GestionLivreBeanRemote;

public class ClientGestionLivres {

	public static void main(String[] args) throws NamingException {
		
		try { 
			Properties p= new Properties(); 
			p.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming"); 
			InitialContext context = new InitialContext(p); 
			GestionLivreBeanRemote gestion = (GestionLivreBeanRemote) context.lookup("ejb:/GestionLivres/GestionLivreBean!session.GestionLivreBeanRemote"); 
			
			
		
			Auteur auteur = new Auteur("1","Sofiane");
			List<Auteur> auteurs = null;
			
			Livre livre = new Livre("Livre de Sofiane",auteurs);
			gestion.ajouterLivre(livre);
			List<Livre> livres = gestion.ListerTousLesLivres();
			for(Livre l: livres){
				System.out.print(l.getIntitule());
			}
			
		}
		
		finally{
			
		}
		
	}

}
