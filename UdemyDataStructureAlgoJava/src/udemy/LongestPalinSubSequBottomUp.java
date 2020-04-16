package udemy;

public class LongestPalinSubSequBottomUp {

	
	public static int longestPal(String s1) {
		
		int[][] dp = new int[s1.length()][s1.length()];
		
		for(int col=0; col<s1.length(); col++) {
			for(int row=s1.length()-1; row>=0; row--) {
				
				if(row>col) {
					dp[row][col] = 0;
				}
				else if(row == col) {
					dp[row][col] = 1;
				}
				else {
				if(s1.charAt(row) == s1.charAt(col)) {
					
					dp[row][col] = Math.max(2 + dp[row+1][col-1], Math.max(dp[row][col-1], dp[row+1][col])); 
				}
				else {
					dp[row][col] = Math.max(dp[row][col-1], dp[row+1][col]);
				}
				}
			}
		}
			
		return dp[0][s1.length()-1];
	}
	
	public static void main(String[] args) {
		String s1 = "ELRMENMET";
		System.out.println(longestPal(s1));
	}

}
