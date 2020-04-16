package udemy;

import java.util.Arrays;

public class SelectionSort {
	
	public static void slection(int[] arr) {
		
		int l = arr.length; 
		for(int i=0; i<l; i++) { //goes from first to last element
			int min = i;     //store unsorted minimum 
			for(int j=i+1; j<l; j++) { // goes to unsorted element in array
				if(arr[j]<arr[min]) 
					min = j;
				}
				//	if(min != i) {
						int temp = arr[i];
						arr[i] = arr[min];
						arr[min] = temp; 
					//}
				}
	}		
	public static void printSorted(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {70,5,90,1,5,75,3};
		slection(arr);
		printSorted(arr);
	}

}
