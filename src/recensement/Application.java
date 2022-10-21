package recensement;

import java.io.IOException;
import java.util.Scanner;

import recensement.questions.RecherchePopulationDep;
import recensement.questions.RecherchePopulationReg;
import recensement.questions.RecherchePopulationVille;
import recensement.questions.TopCom;
import recensement.questions.TopComByDep;
import recensement.questions.TopComByReg;
import recensement.questions.TopDep;
import recensement.questions.TopRegion;

public class Application {

	public static void main(String[] args) throws IOException {
		
		Scanner saisieUtilisateur = new Scanner(System.in);
		
		System.out.println("- 1. Population d’une ville donnée\r\n"
				+ "- 2. Population d’un département donné\r\n"
				+ "- 3. Population d’une région donnée\r\n"
				+ "- 4. Afficher les 10 régions les plus peuplées\r\n"
				+ "- 5. Afficher les 10 départements les plus peuplés\r\n"
				+ "- 6. Afficher les 10 villes les plus peuplées d’un département\r\n"
				+ "- 7. Afficher les 10 villes les plus peuplées d’une région\r\n"
				+ "- 8. Afficher les 10 villes les plus peuplées de France\r\n"
				+ "- 9. Sortir\r\n"
				);
		String choixString = saisieUtilisateur.next();
		int choix = Integer.parseInt(choixString);
		
		
		switch (choix){
		case 1:
				RecherchePopulationVille recherche = new RecherchePopulationVille();
				recherche.traiter();
				break;
		case 2:
			RecherchePopulationDep rechercheDep = new RecherchePopulationDep();
			rechercheDep.traiter();
			break;
		case 3:
			RecherchePopulationReg rechercheReg = new RecherchePopulationReg();
			rechercheReg.traiter();
			break;
		case 4:
			TopRegion topReg = new TopRegion();
			topReg.traiter();
			break;
		case 5:
			TopDep topDep = new TopDep();
			topDep.traiter();
			break;
		case 6 :
			TopComByDep topComDep = new TopComByDep();
			topComDep.traiter();
			break;
		case 7 :
			TopComByReg topComReg = new TopComByReg();
			topComReg.traiter();
			break;
		case 8 :
			TopCom topCom = new TopCom();
			topCom.traiter();
			break;
		case 9 :
			System.out.println("Merci et au revoir");
			
			break;
				
		}
		saisieUtilisateur.close();
	}

}
