package Models;

import java.time.LocalDateTime;
import java.util.List;

public class Employe {
	
	private String nom;
	private String prenom;
	private String email;
	private String poste;
	private LocalDateTime date_embauche;
	
	
	

	public Employe(String nom, String prenom, String email, String poste) {

		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.poste = poste;
		this.date_embauche = LocalDateTime.now();
	}
	
	public Employe() {
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPoste() {
		return poste;
	}


	public void setPoste(String poste) {
		this.poste = poste;
	}


	public LocalDateTime getDate_embauche() {
		return date_embauche;
	}


	public void setDate_embauche(LocalDateTime date_embauche) {
		this.date_embauche = date_embauche;
	}


	

}
