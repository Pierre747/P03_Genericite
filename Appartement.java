package fr.genericite;

public class Appartement implements IRedevable<TaxeHabitation> // On change le type générique T de IRedevable a TaxeHabitation
{
	private float surface;
	
	public Appartement(float surface) {
		this.surface = surface;
	}

	@Override
	public float calculerTaxe(TaxeHabitation taxeHabitation) {
		return taxeHabitation.calculerTH(surface);
	}
	
}
