package udemy;

import java.util.Arrays;

public class CoinChange {

	public static void coinCh(int[] coins, int value) {
	
		Arrays.sort(coins);
		int total = 0;
			for(int index=coins.length-1; index>0; index-- ) {
			
			int coinValue = coins[index];
			
			int maxValue = (value/coinValue) * coinValue;
			
			if(maxValue>0) {
			
			System.out.println("Coin Value: " +coinValue+ "Count is :"+(value/coinValue));
			total += (value/coinValue);
			value = value - maxValue;
			}	
		}
			System.out.println("Total count is: " +total);			
	}
	public static void main(String[] args) {
		
		int coins[] = {1,2,5,10,20,50,100,500,1000};
		int value = 2045;
		coinCh(coins, value);

	}

}
