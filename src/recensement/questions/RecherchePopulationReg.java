package recensement.questions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

public class RecherchePopulationReg extends MenuService {

	@Override
	public void traiter() throws IOException {
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		Recensement.getRecensementVille(listVille);
				
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Choisissez une région ? ");
		String choix = saisieUtilisateur.nextLine();
		
		
		int somme = 0;
		for (Ville ville: listVille){
			if (ville.getRegName().equalsIgnoreCase(choix)){
				somme+=ville.getComPop();
			}
		}
		if (somme>0){
			System.out.println("Population de la régiont "+choix+" : "+ somme);
		}
		else {
			System.out.println("La Région "+choix+ " est non trouvée.");
		}
		saisieUtilisateur.close();
	}

}
