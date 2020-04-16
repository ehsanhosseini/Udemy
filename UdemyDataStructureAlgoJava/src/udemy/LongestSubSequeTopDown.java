package udemy;

public class LongestSubSequeTopDown {
	
	public static int printLongest(String s1, String s2) {
		
		int[][] dp = new int[s1.length()][s2.length()];
		return longestSub(s1, s2, 0, 0, dp);
	}
	
	public static int longestSub(String s1, String s2, int startingS1, int startingS2, int[][] dp ) {
		
		if(s1.length() == startingS1 || s2.length() == startingS2)
			return 0;
		
		if(dp[startingS1][startingS2] == 0) {
		int sub1 = 0;
		if(s1.charAt(startingS1) == s2.charAt(startingS2)) 
			sub1 = 1 + longestSub(s1, s2, startingS1 + 1, startingS2 +1, dp);
				
		int sub2 = longestSub(s1, s2, startingS1 + 1, startingS2, dp);
		int sub3 = longestSub(s1, s2, startingS1, startingS2 +1, dp);
		
		dp[startingS1][startingS2] = Math.max(sub1,Math.max(sub2, sub3));
		}
		return dp[startingS1][startingS2];
	}
	public static void main(String[] args) {
	String s1 = "elephant";
	String s2 = "eretpat";

	System.out.println(printLongest(s1, s2));
	}

}
