package fr.genericite;

public class Personne
{
	private String nom, prenom;
	private int annee_naissance;
	
	// Constructeur
	
	public Personne(String nom, String prenom, int annee_naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.annee_naissance = annee_naissance;
	}
	
	
	// Méthode toString
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", annee_naissance=" + annee_naissance + "]";
	}

	// Getters and setters

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
	public int getAnnee_naissance() {
		return annee_naissance;
	}
	public void setAnnee_naissance(int annee_naissance) {
		this.annee_naissance = annee_naissance;
	}
	
	
}
