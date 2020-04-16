package udemy;

public class NapsackRecurtion {
	
	
	public static int printNapshack(int[] profit, int[] weigth, int capacity, int currentIndex ) {
		return napsack(profit, weigth, 7, 0);
	}
	
	
	public static int napsack(int[] profit, int[] weigth, int capacity, int currentIndex) {
		
		if(capacity<=0 || currentIndex<0 || currentIndex>=profit.length)
			return 0;
		
		int profit1 = 0;
		if(weigth[currentIndex]<=capacity) {
		 profit1 = profit[currentIndex] + napsack(profit, weigth, capacity - weigth[currentIndex], currentIndex+1);
		}
		
		 int profit2 = 0 + napsack(profit, weigth, capacity, currentIndex+1);
		
		return Math.max(profit1, profit2);
	} 
	
	 

	public static void main(String[] args) {
		
		int profit[] = {31,26,72,17};
		int weigth[] = {3,1,5,2};
		int capacity = 7;
		int currentIndex = 0;
		System.out.println(printNapshack(profit, weigth, capacity , currentIndex));
	}

}
