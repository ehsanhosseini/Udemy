package udemy;

public class MinCostBottomUpDP {
	
	
	public static int minCost(int[][] n, int row, int col) {
		int[][] dp = new int[n.length+1][n.length+1];	
		
		for(int i=0; i<=col; i++) {
			dp[0][i] = Integer.MAX_VALUE; 
		}
		for(int i=0; i<=row; i++) {
			dp[i][0] = Integer.MAX_VALUE; 
		}
		
		dp[1][0] = 0;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + n[i-1][j-1];
			}
		}
		
		
		return dp[row][col];
	}
	
 
	public static void main(String[] args) {
		int[][] n = {
				{ 4, 7, 8, 6, 4 },
				{ 6, 7, 3, 9, 2 },
				{ 3, 8, 1, 2, 4 },
				{ 7, 1, 7, 3, 7 },
				{ 2, 9, 8, 9, 3 }
			};
		
		System.out.println(minCost(n, n.length, n.length));

	}

}
