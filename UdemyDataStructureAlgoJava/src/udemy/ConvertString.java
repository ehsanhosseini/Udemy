package udemy;

public class ConvertString {
	
	public static int finalPrint(String s1, String s2) {
		
		return findMinOperation(s1, s2, 0, 0);
	}
	
	public static int findMinOperation(String s1, String s2, int startingS1, int startingS2) {
		
		if(startingS1 == s1.length())
			return s2.length() - startingS2;
		if(startingS2 == s2.length())
			return s1.length() - startingS1;
		
		if(s1.charAt(startingS1) == s2.charAt(startingS2)) {
		return findMinOperation(s1, s2, startingS1 + 1, startingS2 + 1);
		}
		
		int c1 = 1 + findMinOperation(s1, s2, startingS1 + 1, startingS2); //Insertion
		int c2 = 1 + findMinOperation(s1, s2, startingS1, startingS2 + 1); //Deletion
		int c3 = 1 + findMinOperation(s1, s2, startingS1 + 1, startingS2 + 1); //Replacement
		
		return Math.min(c1, Math.min(c2, c3));
	}

	public static void main(String[] args) {
		String s1 = "table";
		String s2 = "tabl";
		System.out.println(finalPrint(s1,s2));
	}

}
