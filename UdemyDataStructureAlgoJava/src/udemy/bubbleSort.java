package udemy;

import java.util.Arrays;

public class bubbleSort {

	public static void buble(int arr[]) {
		
		int l = arr.length-1;
		for(int i=0; i<l; i++) {
			for(int j=0; j<l-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printBuble(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,2,50,6,4,6,1};
		
		buble(arr);
		
		printBuble(arr);

	}

}







