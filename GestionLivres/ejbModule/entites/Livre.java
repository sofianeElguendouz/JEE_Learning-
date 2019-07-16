package entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.*;

@Entity
public class Livre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String intitule;
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.EAGER)
	private List<Auteur>auteurs;
	
	
	public Livre() { super(); }
	public Livre(String intitule, List<Auteur> auteurs){
		super();
		this.intitule = intitule;
		this.auteurs = auteurs;
	}
	
	
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	@XmlTransient
	public List<Auteur> getAuteurs() {
		return auteurs;
	}
	public void setAuteurs(List<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	public int getId() {
		return id;
	}
}
