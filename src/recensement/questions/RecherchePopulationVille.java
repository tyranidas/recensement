package recensement.questions;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import recensement.*;

public class RecherchePopulationVille  extends MenuService {

	
	
/*	public static void traiter() throws IOException */
	
		
	/*
	{
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		Recensement.getRecensement(listVille);
		
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Choisissez une ville");
		String scanVille = saisieUtilisateur.next();
		for (Ville v: listVille)
		{
		
			if ( scanVille.equals(v.getComName()) )
				
				{
				System.out.println(v.getComName()+" abrite "+v.getComPop()+" habitants");
				}
			else
			{
				System.out.println("Cette ville n'existe pas");
				
			}
			
			
		}
		
		saisieUtilisateur.close();
	}	
	/*	Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Choisissez une ville");
		String result = saisieUtilisateur.next();
		*/
	
		
		/*
		for (Ville v : listVille )
		{
			System.out.println(listVille(v));
		}
		*/
		//saisieUtilisateur.close();
	

	@Override
	public void traiter() throws IOException {
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		Recensement.getRecensementVille(listVille);
		
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Choisissez une ville");
		String scanVille = saisieUtilisateur.next();
		
		int villeCpteur = 0;
		for (Ville v: listVille)
		{
			if ( scanVille.equals(v.getComName()))
			{
				villeCpteur++;
			}
		}
		
		
			if (villeCpteur > 0)
			{
				for (Ville w: listVille)
				{
					if ( scanVille.equals(w.getComName()) )
					{
						System.out.println(w.getComName()+" abrite "+w.getComPop()+" habitants");
					}
				}
			}
			else
			{
				System.out.println("Cette ville n'existe pas dans la BDD");
			}
		
			
		
		
		
			saisieUtilisateur.close();
	}
	
	

}
