package session;

import java.util.List;

import javax.ejb.Local;

import entites.Livre;

@Local
public interface GestionLivreBeanLocal {
	void ajouterLivre(Livre livre);
	List<Livre> ListerTousLesLivres();

}
