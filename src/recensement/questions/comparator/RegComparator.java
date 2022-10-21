package recensement.questions.comparator;

import java.util.Comparator;

import recensement.Region;

@SuppressWarnings("hiding")
public class RegComparator<Region> implements Comparator<Region> {

	private boolean asc;
		
	public RegComparator(boolean asc) {
		super();
		this.asc = asc;
	}


	@Override
	public int compare(Region r1, Region r2) {
		
		if (asc)
		{
			if (((recensement.Region) r1).getRegPop()> ((recensement.Region) r2).getRegPop())
			{
				return 1 ;
			}
			if (((recensement.Region) r1).getRegPop()< ((recensement.Region) r2).getRegPop())
			{
				return -1 ;
			}
			return 0;
		}
		else
		{
			if (((recensement.Region) r1).getRegPop()> ((recensement.Region) r2).getRegPop())
			{
				return -1;
			}
			if (((recensement.Region) r1).getRegPop()< ((recensement.Region) r2).getRegPop())
			{
				return 1 ;
			}
			return 0;
		}
		
		
	}

	
}