package udemy;

public class MinCostTopDowndpRecurstion {

	
public static int printMinCost(int[][] arr, int row, int col) {
	int[][] dp = new int[arr.length+1][arr.length+1];
		return minCost(arr,row, col, dp);
	}
	public static int minCost(int[][] arr, int row, int col, int[][] dp) {
		
		if(row == -1 || col == -1) {
			return Integer.MAX_VALUE;
		}
		
		if(row == 0 && col == 0)
			return arr[0][0];
		if(dp[row][col] == 0) {
	int min1 = minCost(arr, row - 1, col, dp);
	int min2 = minCost(arr, row, col - 1, dp);
		
		int minimumCost = Math.min(min1, min2);
		int curCelCost = arr[row][col];
		dp[row][col] = minimumCost + curCelCost;
		}
		
		return dp[row][col];
	}
	
	public static void main(String[] args) {
	 
		int[][] arr = {{4,7,8,6,4,1},
						{6,7,3,9,2,1},
						{3,8,1,2,4,2},
						{7,1,7,3,7,3},
						{2,9,8,9,3,4}};
		System.out.println(printMinCost(arr, arr.length-1, arr[0].length-1));
		System.out.println(arr.length);
	}


}
