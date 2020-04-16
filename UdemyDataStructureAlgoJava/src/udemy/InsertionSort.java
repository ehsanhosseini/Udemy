package udemy;

public class InsertionSort {

	public static void insertion(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int currentNumber = arr[i];
			int j = i;
			while(j>0 && currentNumber<arr[j-1] ) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = currentNumber;
		}
	}
	public static void printInsertion(int arr[]) {
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
	}
	public static void main(String[] args) {
	int arr[] = {2,6,1,90,80,4,0};
	insertion(arr);
	printInsertion(arr);
	}

}
