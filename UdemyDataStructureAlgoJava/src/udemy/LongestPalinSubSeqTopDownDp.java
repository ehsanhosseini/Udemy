package udemy;

public class LongestPalinSubSeqTopDownDp {

	public static int printCount(String s1) {
		Integer[][] dp = new Integer[s1.length()][s1.length()];
		return longestPal(dp, s1, 0, s1.length() -1);
	}
	
	public static int longestPal(Integer[][] dp,String s1, int startIndexS1, int endIndexS1) {
		
		if(startIndexS1>endIndexS1) {
			return 0;
		}
		if(startIndexS1 == endIndexS1 ) { 
			return 1;
		}
		int sub3 = 0;
		if(dp[startIndexS1][endIndexS1] == null) {
			
			if(s1.charAt(startIndexS1) == s1.charAt(endIndexS1)) {
				sub3 = 2 + longestPal(dp, s1, startIndexS1 + 1, endIndexS1 - 1);
			}
		
				int sub1 = longestPal(dp, s1, startIndexS1 + 1, endIndexS1);
				int sub2 = longestPal(dp, s1, startIndexS1, endIndexS1 - 1); 
				
				dp[startIndexS1][endIndexS1] = Math.max(sub3, Math.max(sub1, sub2));
			
		}  
		return dp[startIndexS1][endIndexS1];
	}
		
	public static void main(String[] args) {
	String s1 = "ELRMENMET";	
	System.out.println(printCount(s1));
	}

}
