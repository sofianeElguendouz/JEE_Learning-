package session;

import java.util.List;

import javax.ejb.Remote;

import entites.Livre;

@Remote
public interface GestionLivreBeanRemote {
	void ajouterLivre(Livre livre);
	List<Livre> ListerTousLesLivres();
}
