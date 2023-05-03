package fr.genericite;

import java.util.TreeMap;

// Je veux stocker des binômes clé valeur de type => employé / responsable
// Pour cela j'ai besoin d'une pile avec deux arguments génériques

//public class PileResponsable<T, U>

// En plus, je veux que les types génériques T et U soient liés par une relation d'héritage
// comme par exemple T extends U

public class PileResponsable<T extends U, U>
{
	// Où U sera la clé (l'employé) et T sera la valeur (le responsable)
	
	// D'abord, je définis un container capable de socker une valeur : Map, TreeMap, etc..
	// La TreeMap demande la clé puis la valeur
	
	private TreeMap<U, T> container = new TreeMap<>();
	
	// Je vais push un employé (clé) et un reponsable (valeur)
	
	public void push(T responsable, U employe)
	{
		// Je ne permets pas d'insérer deux fois le même employé sur la même clé
		
		// Donc je fais un test pour savoir si la clé U existe déjà et si c'est le cas, je lève une exception
		
		if(container.containsKey(employe))
		{
			throw new RuntimeException("La clé " + employe + " existe déjà !");
		} else
		{
			container.put(employe, responsable); // La méthode put demande de mettre la clé en premier puis sa valeur
		}
	}
	
	// La méthode pop me permet de récupérer le responsable d'un employé => la valeur d'une clé
	
	public T pop(U employe)
	{
		T responsable = container.get(employe); // Je récupère le responsable attaché à la clé employé
		
		container.remove(employe); // Je supprime le binôme clé/valeur du container
		
		return responsable; // Je retourne la valeur => le responsable
	}
	
}
