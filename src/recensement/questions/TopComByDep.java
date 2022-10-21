package recensement.questions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import recensement.ComComparator;
import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

public class TopComByDep extends MenuService {

	@Override
	public void traiter() throws IOException {
		// On créer la liste des 36 000 communes
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		Recensement.getRecensementVille(listVille);
		
		// on demande à l'utilisateur le choix du département
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Quel est le numéro du département ? ");
		String choix = saisieUtilisateur.nextLine();
		
		// On instancie une liste pour le département choisi
		ArrayList<Ville> depChoice = new ArrayList<Ville>();
		
		// on y ajoute les villes du département
		for (Ville v : listVille)
		{
			if (v.getDepCode().equalsIgnoreCase(choix))
			{
				depChoice.add(v);
			}
			
		}
		
		//On range les villes du plus grand nombre d'habitant au plus petit
		Collections.sort(depChoice, new ComComparator<Ville>(false) );
		
		// On affiche les 10 plus grosses
		for (int i =0; i<10; i++)
		{
			System.out.println(depChoice.get(i));
		}
		// on ferme le scanner
		saisieUtilisateur.close();
	}

}
