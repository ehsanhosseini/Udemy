package udemy;

public class ConvertStringTopDownDP {

	public static int printCount(String s1, String s2) {
		int[][] dp = new int[s1.length()+1][s2.length()+1]; 
		return coverStrig(s1, s2, 0, 0, dp);
	}	
	public static int coverStrig(String s1, String s2, int startingS1, int startingS2, int[][] dp) {
		
		if(dp[startingS1][startingS2] == 0) {
		if(startingS1 == s1.length())
			dp[startingS1][startingS2] = s2.length() - startingS2;
		
		else if(startingS2 == s2.length())
			dp[startingS1][startingS2] = s1.length() - startingS1;
		
		
		else if(s1.charAt(startingS1) == s2.charAt(startingS2))
			dp[startingS1][startingS2] = coverStrig(s1, s2, startingS1 + 1, startingS2 + 1, dp);
		else {
		int delete = coverStrig(s1, s2, startingS1, startingS2 + 1, dp);
		int insert = coverStrig(s1, s2, startingS1 + 1, startingS2, dp);
		int replace = coverStrig(s1, s2, startingS1 + 1, startingS2 + 1, dp);
		
		dp[startingS1][startingS2] = 1 + Math.min(delete, Math.min (insert, replace));
			}
		}
		return dp[startingS1][startingS2];
	}
      
	public static void main(String[] args) {
		
	String s1 = "table";
	String s2 = "tdble";
	System.out.println(printCount(s1, s2));
		

	}

}
