package udemy;

public class MergeSort {
	
	
	public static void mergeS(int[] arr, int start,int end) {
		
		if(start<end) {
		int mid = (start+end)/2;
		mergeS(arr, start, mid);
		mergeS(arr, mid+1, end);
		totalMerge(arr,start, mid, end);
		}
	}
	public static void totalMerge(int[] arr, int start, int mid, int end) {
		// intialize size of subarrays left and right
		int n1 = mid - start + 1; 
		int n2 = end - mid;
		
		//create two temp subaaray Left and Right
		int temLeft[] = new int[n1]; 
		int temRight[] = new int[n2];
		
		//copy data to the temp array
		for(int i=0; i<n1; i++) {
			temLeft[i] = arr[start+i]; 
		}
		for(int j=0; j<n2; j++) {
			temRight[j] = arr[mid+j+1];
		}
		
		/*Merge Temp Arrays*/
		
		//intilaze index of merge for first and second subarray
		int i = 0, j=0;
		int k = start;
		while(i<n1 && j<n2) {
			if(temLeft[i]<=temRight[j]) {
				arr[k] = temLeft[i];
				i++;
			}
			else {
				arr[k] = temRight[j];
				j++;
			}
			k++;
		}
		//Copy remaining of element of TempLeft if any
		while(i<n1) {
			arr[k] = temLeft[i];
			i++;
			k++;
		}
		
		//Copy remaining of element of TempRight if any
		while(i<n2) {
			arr[k] = temRight[j];
			j++;
			k++;
		}
		}
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
		
	public static void main(String[] args) {
		int arr[] = {8,4,9,1,90,50,16,7};
		mergeS(arr, 0, arr.length-1);
		printArray(arr);
	}

}





