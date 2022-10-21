package recensement.questions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import recensement.ComComparator;
import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

public class TopComByReg extends MenuService {

	@Override
	public void traiter() throws IOException {
		// TODO Auto-generated method stub
		// On créer la liste des 36 000 communes
				ArrayList<Ville> listVille = new ArrayList<Ville>();
				Recensement.getRecensementVille(listVille);
				
				// on demande à l'utilisateur le choix de la région
				Scanner saisieUtilisateur = new Scanner(System.in);
				System.out.println("Quel est le nom de la région ? ");
				String choix = saisieUtilisateur.nextLine();
				
				// On instancie une liste pour le région choisi
				ArrayList<Ville> regChoice = new ArrayList<Ville>();
				
				// on y ajoute les villes du département
				for (Ville v : listVille)
				{
					
					if (v.getRegName().equalsIgnoreCase(choix))
					{
						
						regChoice.add(v);
					}
				}
				
								
				//On range les villes du plus grand nombre d'habitant au plus petit
				Collections.sort(regChoice, new ComComparator<Ville>(false) );
				
				// On affiche les 10 plus grosses
				for (int i =0; i<10; i++)
				{
					System.out.println(regChoice.get(i));
				}
				// on ferme le scanner
				saisieUtilisateur.close();
	}

}
