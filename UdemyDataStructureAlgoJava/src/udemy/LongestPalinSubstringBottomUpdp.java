package udemy;

public class LongestPalinSubstringBottomUpdp {

	public static int longestPal(String str) {
	
	int[][] dp = new int[str.length()][str.length()];
	
	for(int i=str.length()-1; i>=0; i--) {
		dp[i][i] = 1;
		for(int j=i+1; j<str.length(); j++) {
			
			if(str.charAt(i) == str.charAt(j)) {
				int l = j - i - 1;
				//int curL = (dp[i+1][j-1] == l?dp[i+1][j-1]+2:0);
				if(dp[i+1][j-1] == l) {
					dp[i][j] =dp[i+1][j-1] + 2 ;
				}
				else {
					dp[i][j] =  0;
				}
				
				dp[i][j] = Math.max(dp[i][j], Math.max(dp[i+1][j],dp[i][j-1])); 
			
			}
			else {
				dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
			}
		}
	}
	return dp[0][str.length()-1];
	}
	
	public static void main(String[] args) {
		String str = "kgaabaak";
		System.out.println(longestPal(str));
	}

}
