package session;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;

import entites.Livre;

/**
 * Session Bean implementation class GestionLivreBean
 */
@Stateless

public class GestionLivreBean implements GestionLivreBeanRemote, GestionLivreBeanLocal {
	@PersistenceContext(unitName="MonEntiteEJB3")
	private EntityManager manager;
    /**
     * Default constructor. 
     */
    public GestionLivreBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void ajouterLivre(Livre livre) {
		manager.persist(livre);
		
	}

	@Override
	public List<Livre> ListerTousLesLivres() {
		
		return manager.createQuery("select l from Livre l").getResultList();
	}

}
