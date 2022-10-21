package recensement.questions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Region;
import recensement.Departement;
import recensement.Ville;

public class TopDep extends MenuService {

	public void traiter() throws IOException {
		
		// on récupère les villes
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		Recensement.getRecensementVille(listVille);
		
		// on instancie une map pour le département
		Map<String, Departement> mapDep = new HashMap<>();
		
		//on créer une entrée dans la map pour chaque département
		for (Ville v : listVille)
		{
			// si il n'y a pas déja le code du Dep
			if(mapDep.get(mapDep.get(v.getDepCode())) == null);
			{
				// on le créer
				mapDep.put(v.getDepCode(),new Departement (v.getDepCode()));
			}
		
		}
		// on instancie une liste pour les Departements
		ArrayList<Departement> listDep = new ArrayList<Departement>();
		
		// On y ajoute les département créer dans la Map
		for (Departement d : mapDep.values())
		{
			listDep.add(d);
		}
		
		// Ajout de la population de chaque département
		for (Departement d : listDep)
		{
			//permet de reset la pop à chaque changement de Departement
			int depPop = 0;
			for (Ville v : listVille)
			{
				// si le dep de la ville correspond à celui qu'on regarde
				if (v.getDepCode().equals(d.getDepNum()))
				{	
					//on additionne les pop des villes
					depPop += v.getComPop();
					// et on renseigne le champ pop du département
					d.setDepHab(depPop);
				}
			}
			
		
		}
		
		//On range les départements par nombre d'habitant décroissant
		Collections.sort(listDep, new DepComparator<Departement>(false));
		
		//on affiche les 10 plus bons
		for (int i =0; i<10; i++)
		{
			System.out.println(listDep.get(i));
		}
		
		
	}

	
}
