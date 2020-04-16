package udemy;

public class SingleDimantionArrayMain {

	public static void main(String[] args) {
		System.out.println("Created a sigle dimantional size of 10");
		SingleDimantionArray sda = new SingleDimantionArray(5);
		
		System.out.println("Print the array");
		sda.traversArray();
		
		System.out.println("Inserted valuse with location");
		sda.insert(0, 100);
		sda.insert(2, 300);
		sda.insert(3, 500);
		sda.insert(2, 10000);
		sda.insert(9, 700);
		
		System.out.println("Access Cell number");
		sda.access(2);
		
	}

}
