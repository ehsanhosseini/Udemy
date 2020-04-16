package udemy;

public class NumOfPathTopDownDp {
	
	public static int count(int[][] arr, int i, int j, int cost) {
		int[][] dp = new int [arr.length+1][arr.length+1];
		return numPath(arr, i, j, cost, dp);
	}
	
	public static int numPath(int[][] arr, int i, int j, int cost, int[][] dp) {
		if(cost<0)
			return 0;
		
		if(i==0 && j==0) {
			return (arr[0][0] - cost == 0)?1:0;
		}
		
		if(dp[i][j] == 0) {
			if(i == 0) {
			dp[i][j] = numPath(arr, 0, j-1, cost - arr[i][j], dp);
				}
			else if(j == 0) {
			dp[i][j] = numPath(arr, i-1, 0, cost - arr[i][j], dp);
			}
		else {
		int path1 = numPath(arr, i - 1 , j, cost - arr[i][j], dp);
		int path2 = numPath(arr, i, j - 1, cost - arr[i][j], dp);
		
		dp[i][j] = path1 + path2;
			}
		}
		return dp[i][j];
	}
	

	public static void main(String[] args) {
		int[][] arr = { 
				  { 4, 7, 1, 6 }, 
				  { 5, 7, 3, 9 }, 
				  { 3, 2, 1, 2 }, 
				  { 7, 1, 6, 3 } };
		System.out.println(count(arr, arr.length-1, arr.length-1, 25));

	}

}
