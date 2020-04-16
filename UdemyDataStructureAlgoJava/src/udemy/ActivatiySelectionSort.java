package udemy;

import java.util.ArrayList;
import java.util.Comparator;

public class ActivatiySelectionSort implements Comparator<Activity> {

	@Override
	public int compare(Activity o1, Activity o2) {
		
		//return o1.getFinish() - o2.getFinish();
		if(o1.getFinish() == o2.getFinish())
			return 0;
		if(o1.getFinish() > o2.getFinish())
			return 1;
		else
			return -1;
	}
	
}
