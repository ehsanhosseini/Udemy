package udemy;

public class SingleDimantionArray {

	int arr[] = null;
	
	//constructor
	public SingleDimantionArray(int sizeOfArray) {
		
		  arr = new int[sizeOfArray];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	//print the array
	public void traversArray() {
		try {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		}
		catch(Exception e) {
			System.out.println("Array is no longer exist");
		}
	}
	
	//Insert value in an array
	public void insert(int location, int value) {
		try {
		if(arr[location]==Integer.MIN_VALUE) {
			arr[location] = value;
			System.out.println("Value successfuly inserted " +value+ " At location " +location);
		}else {
			System.out.println("This cell is already occupied");
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Invalid Index to access th Array");
		}
	}
	
	//Accessing cell number
	public void access(int accessCell) {
		System.out.println(arr[accessCell]);
	}
	
	
}
