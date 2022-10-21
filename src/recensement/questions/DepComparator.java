package recensement.questions;

import java.util.Comparator;

import recensement.Departement;
import recensement.Region;

public class DepComparator<Region> implements Comparator<Departement> {

	private boolean asc;
		
	public DepComparator(boolean asc) {
		super();
		this.asc = asc;
	}


	@Override
	public int compare(Departement d1, Departement d2) {
		
		if (asc)
		{
			if (((recensement.Departement) d1).getDepHab()> ((recensement.Departement) d2).getDepHab())
			{
				return 1 ;
			}
			if (((recensement.Departement) d1).getDepHab()< ((recensement.Departement) d2).getDepHab())
			{
				return -1 ;
			}
			return 0;
		}
		else
		{
			if (((recensement.Departement) d1).getDepHab()< ((recensement.Departement) d2).getDepHab())
			{
				return 1 ;
			}
			if (((recensement.Departement) d1).getDepHab()> ((recensement.Departement) d2).getDepHab())
			{
				return -1 ;
			}
			return 0;
		}
		
		
	}

	
}