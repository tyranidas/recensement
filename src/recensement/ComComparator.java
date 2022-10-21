package recensement;

import java.util.Comparator;

@SuppressWarnings("hiding")
public class ComComparator<Ville> implements Comparator<Ville> {

	private boolean asc;

	public ComComparator(boolean asc) {
		super();
		this.asc = asc;
	}

	@Override
	public int compare(Ville v1, Ville v2) {

		// si on veut les plus petites
		if (asc) {
			if (((recensement.Ville) v1).getComPop() > ((recensement.Ville) v2).getComPop()) {
				return 1;
			}
			if (((recensement.Ville) v1).getComPop() < ((recensement.Ville) v2).getComPop()) {
				return -1;
			}
			return 0;
		}
		// si on veut les plus grandes
		else {
			if (((recensement.Ville) v1).getComPop() < ((recensement.Ville) v2).getComPop()) {
				return 1;
			}
			if (((recensement.Ville) v1).getComPop() > ((recensement.Ville) v2).getComPop()) {
				return -1;
			}
			return 0;
		}

	}

}
