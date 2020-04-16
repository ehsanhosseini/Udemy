package udemy;

public class LongestPalinSubStringTopDown {

	public static int printCount(String s1) {
		int[][] dp = new int[s1.length()][s1.length()];
		return longestSub(s1, 0, s1.length()-1, dp);
	}
	
	
	public static int longestSub(String s1, int startIndex, int endIndex, int dp[][]) {
		
		if(startIndex>endIndex) {
			return 0;
		}
		if(startIndex == endIndex) {
			return 1;
		}
		
		if(dp[startIndex][endIndex] == 0) {
			int sub1 = 0;
			if(s1.charAt(startIndex) == s1.charAt(endIndex)) {
				int remining = endIndex - startIndex -1;
				if(remining == longestSub(s1, startIndex+1, endIndex-1, dp)) {
				sub1 = 2 + remining;
				}
			}
			int sub2 = longestSub(s1, startIndex+1, endIndex, dp);
			int sub3 = longestSub(s1, startIndex, endIndex-1, dp);
			
			dp[startIndex][endIndex] = Math.max(sub1, Math.max(sub2, sub3));
		}
		return dp[startIndex][endIndex];
		
		
	}
	
	public static void main(String[] args) {
		String s1 = "MAMDRDM";
		System.out.println(printCount(s1));
	}

}
