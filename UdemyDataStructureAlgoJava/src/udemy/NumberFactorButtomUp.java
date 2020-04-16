package udemy;

public class NumberFactorButtomUp {
	
	public static int numberFac(int n) {
		
		int[] table = new int[n+1];
		table[0] = 1;
		table[1] = 1;
		table[2] = 1;
		table[3] = 2;
		
		for(int i=4; i<table.length; i++) {
			
			//table[n] = table[i - 0] + table[i - 1] + table[i - 2] + table[i - 3];
			table[i] = table[i-1] + table[i-3] + table[i-4];
		}
				
		
		return table[n];
		
	}

	public static void main(String[] args) {
		System.out.println(numberFac(5));
	}

}
