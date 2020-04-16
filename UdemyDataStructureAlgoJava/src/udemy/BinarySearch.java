package udemy;

public class BinarySearch {
	
	public static int findNum(int arr[], int start, int end, int num) {
		 
		int mid = start+(end-start)/2;
		if(arr[mid] == num) {
			return mid;
		}
		if(num>arr[mid]) {
		return	findNum(arr, mid+1, end, num);
		}
		else {
		return	findNum(arr, start, mid-1, num );
		}
		
	}
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int num = 40;
		System.out.println(findNum(arr, 0, arr.length-1, num));
		

	}

}
