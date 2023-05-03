package fr.genericite;

public class Produit implements IRedevable<TVA> // Ici, dans le diamant, on change le type T de base, par le type que l'on souhaite : TVA
{
	private float prixHT;

	public Produit(float prixHT)
	{
		this.prixHT = prixHT;
	}

	@Override
	public float calculerTaxe(TVA TVA)
	{
		return TVA.calculerTVA(prixHT);
	}
	
}
