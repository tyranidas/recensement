package recensement.questions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import recensement.ComComparator;
import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

public class TopCom extends MenuService {

	@Override
	public void traiter() throws IOException {
		// On créer la liste des 36 000 communes
				ArrayList<Ville> listVille = new ArrayList<Ville>();
				Recensement.getRecensementVille(listVille);
				
				//On range les villes du plus grand nombre d'habitant au plus petit
				Collections.sort(listVille, new ComComparator<Ville>(false) );
				
				// On affiche les 10 plus grosses
				for (int i =0; i<10; i++)
				{
					System.out.println(listVille.get(i));
				}
			

	}

}
