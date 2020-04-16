package udemy;

public class NumberFactorTopDownDP {
	
public static int dp(int n) {
	int[] memo = new int[n+1];
	return numberOfWays(n, memo);
} 
	
public static int numberOfWays(int n, int memo[]) {
		
		if((n == 0) || (n == 1) || (n == 2))
			return 1;
		if(n == 3)
			return 2;
		if(memo[n] == 0) {
		int sub1 = numberOfWays(n-1, memo);
		int sub2 = numberOfWays(n-3, memo);
		int sub3 = numberOfWays(n-4, memo);
		
		memo[n] = sub1 + sub2 + sub3;
		}
		return memo[n];
	}

	public static void main(String[] args) {
		System.out.println(dp(5));
	}

}
