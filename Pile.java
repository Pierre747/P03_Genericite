package fr.genericite;

import java.util.ArrayList;

// Le type d'objet T sera précisé lors de la création de la pile

public class Pile<T>
{
	private ArrayList<T> container = new ArrayList<>();
	
	// Une pile doit proposer au moins deux méthodes :
	// 1 - push() pour insérer sur la pile un élément
	// 2 - pop() pour retirer de la pile le dernier élément posé, celui en haut de la pile
	
	public void push(T item)
	{
		container.add(0, item); // on précise la position 0 à l'item qui arrive, comme ça, tout nouvel élément est en haut de la pile
	}
	
	public T pop()
	{
		if(container.size() == 0)
		{
			throw new IllegalArgumentException("La pile est vide");
		} else
		{
			T item = container.get(0);
			container.remove(0);
			return item;
		}
		
	}
	
	public boolean isVide()
	{
		return container.size() == 0;
	}

}
