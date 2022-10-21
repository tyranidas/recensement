package recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import recensement.Ville;

public class Recensement {

	public static ArrayList<Ville> getRecensementVille(ArrayList<Ville> list1) throws IOException
	{
		Path path = Paths.get("C:\\Users\\tyran\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\approche-object\\src\\fichier\\recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		lines.remove(0);
		
		for (String l: lines)
		{
			
			
			 String[] tokens = l.split(";");
			 String hab = tokens[9].replaceAll("\\s", "");
			 
			  list1.add(new Ville(tokens[0], tokens[1],tokens[2],tokens[5],tokens[6],Integer.parseInt(hab)));
		}
		
		
		return list1;
		
	}
	
	
	
	
}
