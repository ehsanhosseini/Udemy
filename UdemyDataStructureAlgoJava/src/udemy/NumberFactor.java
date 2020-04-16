package udemy;

public class NumberFactor {
	
	public static int numberOfWays(int n) {
		
		if((n == 0) || (n == 1) || (n == 2))
			return 1;
		if(n == 3)
			return 2;
		
		int sub1 = numberOfWays(n-1);
		int sub2 = numberOfWays(n-3);
		int sub3 = numberOfWays(n-4);
		
		return sub1 + sub2 + sub3;
	}

	public static void main(String[] args) {
		//int n =5;
		System.out.println(numberOfWays(6));

		
	}

}
