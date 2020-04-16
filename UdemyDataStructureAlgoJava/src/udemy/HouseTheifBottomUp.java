package udemy;

public class HouseTheifBottomUp {

	public static int houseTh(int[] houseWelth) {
		
		
 		int[] dp = new int[houseWelth.length+2];
		dp[houseWelth.length] = 0;
		
		
		for(int i=houseWelth.length-1; i>=0; i--) {
			
			dp[i] = Math.max(houseWelth[i] + dp[i+2], dp[i+1]);
		}
		
		return dp[0];
		
	}
	
	public static void main(String[] args) {
		int HouseWorth[] = {6,7,1,30,8,2,4};
		System.out.println(houseTh(HouseWorth));
	}

}
