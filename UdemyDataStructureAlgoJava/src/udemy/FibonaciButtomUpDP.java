package udemy;

public class FibonaciButtomUpDP {
	
	public static int fib(int n) {
		
		
		
		int[] table =  new int[n+1];
		table[0] = 0;
		table[1] = 1;
		
		for(int i=2; i<=n; i++) {
			
			table[i] = table[i-1] + table[i-2];  
		}
		
		//return table[n];
		return table[n-1] + table[n-2];
	}
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(fib(n));

	}

}
