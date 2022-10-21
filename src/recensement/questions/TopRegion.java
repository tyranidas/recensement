package recensement.questions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Region;
import recensement.Ville;
import recensement.questions.comparator.RegComparator;

public class TopRegion extends MenuService {

	@Override
	public void traiter() throws IOException {
		
		ArrayList<Ville> listVille = new ArrayList<Ville>();
		Recensement.getRecensementVille(listVille);
		
		Map<String, Region> mapRegions = new HashMap<>();
		
		
		for (Ville v : listVille)
		{
			if(mapRegions.get(mapRegions.get(v.getRegName())) == null);
			{
				mapRegions.put(v.getRegName(),new Region (v.getRegCode(),v.getRegName()));
			}
		
		}
		ArrayList<Region> listRegion = new ArrayList<Region>();
		
		for (Region r : mapRegions.values())
		{
			listRegion.add(r);
		}
		
		for (Region r : listRegion)
		{
			int regPop = 0;
			for (Ville v : listVille)
			{
				if (v.getRegCode().equals(r.getRegCode()))
				{
					regPop += v.getComPop();
					r.setRegPop(regPop);
				}
			}
		
		}
		
		Collections.sort(listRegion, new RegComparator<Region>(false) );
		
		for (int i =0; i<10; i++)
		{
			System.out.println(listRegion.get(i));
		}
	}

	
}
