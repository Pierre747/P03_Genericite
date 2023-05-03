package fr.genericite;

public class Citoyen2 implements IRedevable2<Impot, TaxeHabitation>
{
	private float revenu;
	private float surfaceAppartement;
	
	public Citoyen2(float revenu, float surfaceAppartement)
	{
		this.revenu = revenu;
		this.surfaceAppartement = surfaceAppartement;
	}

	@Override
	public float calculerTaxe1(Impot impot)
	{
		return impot.calculerImpot(revenu);
	}

	@Override
	public float calculerTaxe2(TaxeHabitation taxeHabitation)
	{
		return taxeHabitation.calculerTH(surfaceAppartement);
	}
	
}
