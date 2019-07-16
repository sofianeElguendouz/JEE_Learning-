package entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;


@Entity
public class Auteur implements Serializable{
	@Id
	private String id;
	private String nom;
	@ManyToMany(mappedBy="auteurs")
	private List<Livre> livres;
	
	
	public Auteur(){ super(); }
	public Auteur(String id, String nom){
		super();
		this.id=id;
		this.nom=nom;
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Livre> getLivres() {
		return livres;
	}
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	
}
