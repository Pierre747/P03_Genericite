package fr.genericite;

// Je déclare que l'employé implémente l'interface Comparable<> pour pouvoir comparer deux employés
// afin de savoir si l'employé à insérer dans la pile existe s'y trouve déjà.

public class Employe extends Personne implements Comparable<Employe>
{
	// Attributs

	private float salaire;
	
	
	// Constructeur
	
	public Employe(String nom, String prenom, int annee_naissance, float salaire) {
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
	
	public Employe(String nom, String prenom, int annee_naissance)
	{
		super(nom, prenom, annee_naissance);
		
	}
	
	// Méthode pour savoir si un employe est déjà présent dans la pile ou pas
		@Override
		public int compareTo(Employe emp)
		{
			return ( this == emp ? 0 : 1);
		}
}
