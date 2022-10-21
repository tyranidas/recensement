package recensement.questions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

public class RecherchePopulationDep extends MenuService {
	
	
		
		
		
	
	
	
	
	public void traiter() throws IOException {
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Quel est le numéro du département recherché ? ");
		String choix = saisieUtilisateur.nextLine();
		
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		Recensement.getRecensementVille(listVille);
		int somme = 0;
		for (Ville ville: listVille){
			if (ville.getDepCode().equalsIgnoreCase(choix)){
				somme+=ville.getComPop();
			}
		}
		if (somme>0){
			System.out.println("Population du département "+choix+" : "+ somme);
		}
		else {
			System.out.println("Département "+choix+ " non trouvé.");
		}
		saisieUtilisateur.close();
	}
		
}
