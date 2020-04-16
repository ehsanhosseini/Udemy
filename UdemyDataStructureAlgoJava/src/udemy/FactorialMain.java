package udemy;

import java.util.ArrayList;
import java.util.Collections;

public class FactorialMain {

	public static void main(String[] args) {
		 
		int weight[] = {6,10,3,5,1,3};
		int value[] = {6,2,1,8,3,5};
		int capacity = 8;
		
		ArrayList<Fractional> list = new ArrayList<Fractional>();
		for(int i=0; i<value.length; i++) {
			list.add(new Fractional(i+1, weight[i], value[i]));
		}
//		list.add(new Fractional(1,6,6));
//		list.add(new Fractional(2,10,2));
//		list.add(new Fractional(3,3,1));
//		list.add(new Fractional(4,5,8));
//		list.add(new Fractional(5,1,3));
//		list.add(new Fractional(6,3,5));
		
		
		Collections.sort(list, new FractionCalulat());
		System.out.println("This is a sorted ratio List:::");
		for(Fractional a:list) {
		System.out.println(a);
		}
		System.out.println("------------------------");
		int totalValue = 0;
		int usedCapacity = 0;
		for(Fractional ITEM:list) {
			if(usedCapacity+ITEM.getWeight()<=capacity) {
				usedCapacity += ITEM.getWeight();
				System.out.println("Taken : "+ITEM);
				totalValue += ITEM.getValue(); 
			}
			else
			{
			    int usedWeight = capacity - usedCapacity;
			    double valueT = ITEM.ratio*usedWeight;
			    System.out.println("Taken :"+ITEM.getItem()+ " Obtain Value:"+valueT+ "   UsedWeigth: "+usedWeight+ "     Ratio: "+ITEM.ratio);
			    usedCapacity += usedWeight;
			    totalValue +=valueT;
			}
			if(usedCapacity==capacity)break;
		}
		
		System.out.println("Total Value is : "+totalValue );
		
	}

}
