package fr.genericite;


public class MonApplication {

	public static void main(String[] args)
	{
		// On va créer deux classes :
		// - classe Personne
		// - classe Pile
		
		Pile<Integer> entiers = new Pile<>();
		Pile<String> societes = new Pile<>();
		Pile<Personne> personnes = new Pile<>();
		
		
		// Gestion des entiers
		
		entiers.push(1);
		entiers.push(2);
		
		System.out.println("Les entiers récupérés à partir de la pile : ");
		while(!entiers.isVide())
		{
			System.out.println(entiers.pop());
		}
		
		
		// Gestion des societes
		
		societes.push("M2I");
		societes.push("AFPA");
		System.out.println("Les sociétés récupérées à partir de la pile : ");
		
		while(!societes.isVide())
		{
			System.out.println(societes.pop());
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();
		
		// Gestion des personnes
		
		personnes.push(new Personne("Chirac", "Jacques", 1940));
		personnes.push(new Personne("Jospin", "Lionel", 1945));
		System.out.println("Les personnes récupérées à partir de la pile : ");
		
		while(!personnes.isVide())
		{
			System.out.println(personnes.pop());
		}
		
		
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- //
		
		// Pour insérer des binômes => clé / valeur :
		
		// On va désormais créer les classes Employe, ChefService, Employe2
		// On va aussi créer la classe PileResponsable qui est une pile générique avec deux arguments,
		// on impose une contrainte d'hérietage entre ces arguments génériques.
		
		// Rappel de la hiérarchie des classes : Personnes <-- Employe <-- ChefService
		
		// ChefService extends Employe
		PileResponsable<ChefService, Employe> responsables = new PileResponsable<>();
		
		//------------------------------------------------------------------------------------------ //
		
		// PileResponsable<ChefService, Employe2> reponsable2 = new PileResponsable<>(); 
		// Cette pile générique ne pourra pas être crée car ChefService n'est pas une sous classe d'Employe2, il n'hérite pas d'Employe2.
		// La contrainte T extends U n'est pas respectée
		
		//------------------------------------------------------------------------------------------ //
		
		// Binôme 1
		
		// Je créé un employé
		Employe e1 = new Employe("N1", "P1", 2000, 1500);
		// Puis un Chef de service
		ChefService cs1 = new ChefService("NC1", "PC1", 1980, 3500, "SAV");
		
		// Je les push dans la pile responsables
		responsables.push(cs1, e1);
		
		
		// Binôme 2
		
		// Je créé un autre employé
		Employe e2 = new Employe("N2", "P2", 1990, 2500);
		// Puis un autre Chef de service
		ChefService cs2 = new ChefService("NC2", "PC2", 1970, 4000, "Commercial");
		
		// Je les push dans la pile responsables
		responsables.push(cs2, e2);
		
		
		//------------------------------------------------------------------------------------------ //
		
		// Je créé un employé et un chef de service
		
		Employe e3 = new Employe("N1", "P1", 1980, 2000);
		ChefService cs3 = new ChefService("NC3", "PC3", 1970, 3000, "Commercial");
		
		// Je les push dans la pile responsables
		responsables.push(cs3, e3);
		
		
		// On va vérifier si l'on peut insérer deux fois la même clef
		
		try 
		{
			responsables.push(cs2, e2);
		}
		catch(RuntimeException ex)
		{
			System.out.println("L'insertion dans la pile de responsable a échoué. \nRaison invoquée : " + ex.getMessage());
		}
		
		
		// Après le pop, on ne trouve plus de valeur pour une clé qui n'existe pas
		// C'est un null qui sera retourné. On peut éviter cela en levant un exception.
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();
		System.out.println("Les responsable de \n\t " + e1 + " \nest\n\t "+ responsables.pop(e1));
		System.out.println();
		
		// Peut-on créer une pile ayant les arguments génériques ChefService, Personne ?
		// Oui c'est possible car Personnes <-- Employe <-- ChefService et donc ChefService hérite de Personne
		
		PileResponsable<ChefService, Personne> responsable2 = new PileResponsable<>();
		
		
		
		//------------------------------------------------------------------------------------------ //
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("-=-= Interface a un paramètre =-=-=");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		// Interface avec 1 paramètre générique
		// Il faut créer :
		// 1 - L'interface IRedevable
		// 2 - Les classes TVA, Impôts, Taxe d'habitation qui seront utilisées 
		// 	   comme argument pour le paramètre générique de l'interface IRedevable.
		// 3 - Créer les classes Produit, Citoyen qui implémentent l'interface IRdeveable
		
		//------------------------------------------------------------------------------------------ //
		
		// Créer les instances de Produit, Citoyen et Appartement pour calculer et affciher les taxes dûes :
		
		Produit p = new Produit(100);
		Citoyen c = new Citoyen(1000);
		Appartement a = new Appartement(100);
		
		// On instancie aussi une nouvelle TVA :
		TVA tva = new TVA();
		
		// On instancie un nouvel impôt pour le citoyen
		Impot impot = new Impot();
		
		// On instancie une nouvelle taxe d'habitation
		TaxeHabitation th = new TaxeHabitation();
		
		// Calcul et affichage avec un System.out
		
		System.out.println();
		System.out.println("TVA produit : " + p.calculerTaxe(tva) + " euros");
		System.out.println();
		System.out.println("Impôt sur le revenu : " + c.calculerTaxe(impot) + " euros");
		System.out.println();
		System.out.println("Taxe d'habitation : " + a.calculerTaxe(th) + " euros");
		System.out.println();
		
		// TODO: Modifier le code utilisé ci-dessus pour ne plus devoir passer les instances de TVA, Impot, TaxeHabitation.
		//	     Passer par des méthodes statiques
		

		//------------------------------------------------------------------------------------------ //
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("-=- Interface a deux paramètres -=-");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		// On va donc devoir créer :
		// - L'interface IRdevable2 avec deux paramètres géånériques
		// - Créer la classe Citoyen2 qui implémente l'interface IRedevable2
		
		//------------------------------------------------------------------------------------------ //
		
		// On crée un nouveau citoyen à partir de notre nouvelle interface Citoyen2
		Citoyen2 ct2 = new Citoyen2(1000, 100);
		
		// On lui fait calculer deux nouvelles taxes
		float impot1 = ct2.calculerTaxe1(impot); // On utilise les instances de impot et de th que l'on a créé plus haut
		float impot2 = ct2.calculerTaxe2(th);
		
		System.out.println();
		System.out.println("L'impôt sur le revenu payé par Citoyen2 : " + impot1);
		System.out.println();
		System.out.println("La taxe d'habitation payée par Citoyen2 : " + impot2);
		System.out.println();
		
	} // Fin de la classe Main

}
