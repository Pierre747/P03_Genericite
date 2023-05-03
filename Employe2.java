package fr.genericite;

public class Employe2 extends Personne implements Comparable<Employe>
{
	// Attributs

	private float salaire;
	
	
	// Constructeur
	
	public Employe2(String nom, String prenom, int annee_naissance, float salaire) {
		super(nom, prenom, annee_naissance);
		this.salaire = salaire;
	}


	// Getters and setters
	
	public float getSalaire() {
		return salaire;
	}


	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	
	// Méthodes
	
	public Employe2(String nom, String prenom, int annee_naissance)
	{
		super(nom, prenom, annee_naissance);
		
	}


	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}