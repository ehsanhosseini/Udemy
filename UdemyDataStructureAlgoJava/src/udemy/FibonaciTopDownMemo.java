package udemy;

public class FibonaciTopDownMemo {
	
	public static int printFib(int n) {
		int[] memo = new int[n+1];
		return fib(n, memo);
	}
	public static int fib(int n, int[] memo ) {
		
//		if(n == 0)
//			return 1;
//		if(n == -1)
//			return 0;
		
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
//		if(memo[n]>0)
//			return memo[n];
	
		 memo[n] = fib(n-1, memo) + fib(n-2, memo);
		return memo[n];
		
	}
	public static void main(String[] args) {
		int n = 6;
				
		System.out.println(printFib(n));

	}

}
