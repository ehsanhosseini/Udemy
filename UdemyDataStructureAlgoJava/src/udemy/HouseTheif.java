package udemy;

public class HouseTheif {

	public static int printMax(int[] HouseWorth) {
		return maxMoneyRecursive(HouseWorth, 0);
	}	
	
	public static int maxMoneyRecursive(int[] HouseWorth, int curIndex) {
		
		if(curIndex>=HouseWorth.length)
			return 0;
		int CurrentHouse = HouseWorth[curIndex] + maxMoneyRecursive(HouseWorth, curIndex+2);
		int SkipCurHouse = maxMoneyRecursive(HouseWorth, curIndex+1);
		
		return Math.max(CurrentHouse, SkipCurHouse); 
		
	}
		
	public static void main(String[] args) {
		
		int HouseWorth[] = {6,7,1,3,8,2,4};
		System.out.println(printMax(HouseWorth));
	}

}
