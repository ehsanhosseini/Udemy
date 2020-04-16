package udemy;

import java.util.ArrayList;
import java.util.Collections;



public class ActivetySelectionProblem {

	public static void main(String[] args) {
		
		ArrayList<Activity> result = new ArrayList<Activity>();
		
		result.add(new Activity("A1", 0, 6 ));
		result.add(new Activity("A2", 3, 4 ));
		result.add(new Activity("A3", 1, 2 ));
		result.add(new Activity("A4", 5, 8 ));
		result.add(new Activity("A5", 5, 7 ));
		result.add(new Activity("A6", 8, 9 ));
		
		Collections.sort(result, new ActivatiySelectionSort());
		Activity periuoseActivity = result.get(0);
		System.out.println(periuoseActivity);
		
		for(int i=1; i<result.size(); i++) {
			Activity activity = result.get(i);
			if(activity.getStart()>= periuoseActivity.getFinish()) {
				System.out.println(activity);
				periuoseActivity = activity;
			}
		}
		System.out.println("Sorted -------");
		for(Activity a:result) {
			
			System.out.println(a.toString());
		}

	}

}
