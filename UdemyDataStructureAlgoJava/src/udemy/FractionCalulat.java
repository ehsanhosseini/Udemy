package udemy;

import java.util.Comparator;

public class FractionCalulat implements Comparator<Fractional> {

	@Override
	public int compare(Fractional o1, Fractional o2) {
		if(o1.ratio == o2.ratio)
		return 0;
		if(o1.ratio>o2.ratio)
		return -1;
		else
			return 1;
	}

	
}

