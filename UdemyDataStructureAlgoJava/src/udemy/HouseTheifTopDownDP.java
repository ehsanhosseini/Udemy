package udemy;

public class HouseTheifTopDownDP {

	public static int printWorth(int[] HouseWorth) {
		int[] dp = new int[HouseWorth.length];
		return houseTh(HouseWorth, 0, dp);
	}

		public static int houseTh(int[] HouseWorth, int currIndex, int[] dp) {
			
			if(currIndex>=HouseWorth.length)
				return 0;
			
			if(dp[currIndex] == 0) {
			int firstHouse =  HouseWorth[currIndex] +  houseTh(HouseWorth, currIndex+2, dp);
			int skipHouse = houseTh(HouseWorth, currIndex+1, dp);
			
			dp[currIndex] = Math.max (firstHouse, skipHouse);	
			}
			return dp[currIndex]; 
		}
		
	public static void main(String[] args) {
		int HouseWorth[] = {6,7,1,3,8,2,4};
		System.out.println(printWorth(HouseWorth));
	}

}
