package udemy;

public class Fibonaci {

	public static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		else
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		
		//int num = 6;
		System.out.println(fib(6));

	}

}
