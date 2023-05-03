package fr.genericite;

public class ChefService extends Employe
{
	private String service;
	
	public ChefService(String nom, String prenom, int annee_naissance, float salaire, String service) {
		super(nom, prenom, annee_naissance, salaire);
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	
	
}
