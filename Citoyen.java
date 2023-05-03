package fr.genericite;

public class Citoyen implements IRedevable<Impot> // Le type de IRedevable est désormais Impot
{
	private float revenu;
	
	public Citoyen(float revenu)
	{
		this.revenu = revenu;
	}

	@Override
	public float calculerTaxe(Impot impotSurLeRevenu) {
		return impotSurLeRevenu.calculerImpot(revenu);
	}
	
}
