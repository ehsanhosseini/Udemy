package udemy;

public class QuickSort {

	
	public static void quickS(int[] arr, int start, int end) {
		if(start<end) {
			int pivot = partition(arr, start, end);
			quickS(arr, start, pivot-1);
			quickS(arr, pivot+1, end);
		}	
	}
	public static int partition(int[] arr, int p, int q) {
		int pivot = q;
		int i = p - 1; 
		for(int j=p; j<=q; j++) {
			if(arr[j]<=arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}	
		return i;
	}
	public static void printSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	}
	public static void main(String[] args) {
		int arr[] = {6,1,11,4,60,7,0,87};
		quickS(arr, 0, arr.length-1);
		printSort(arr);

	}

}
