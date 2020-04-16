package udemy;

public class NapSackTopDownDP {

	public static int printMaxPro(int[] profit, int[] weight, int capacity) {
		Integer[][] dp = new Integer[profit.length][capacity+1];
		return napSack(profit, weight, 0, capacity, dp);
	}
	
	public static int napSack(int[] profit, int[] weight, int curIndex, int capacity, Integer[][] dp) {
		
		if(curIndex>=profit.length || curIndex<0 || capacity<=0)
			return 0;
		
		if(dp[curIndex][capacity] != null) 
			return dp[curIndex][capacity];
			
		int pro1 = 0;
		if(capacity>=weight[curIndex]) 
			pro1 = profit[curIndex] + napSack(profit, weight, curIndex + 1, capacity - weight[curIndex], dp);
			
		int	pro2 = 0 + napSack(profit, weight, curIndex + 1, capacity, dp);
		
			dp[curIndex][capacity] = Math.max(pro1, pro2);
			return dp[curIndex][capacity];
		 
	}
	
	public static void main(String[] args) {
	
		int[] profit = {31,26, 72,17};
		int[] weight = {3,1,5,2};
		System.out.println(printMaxPro(profit, weight, 7));
	}
}
