package udemy;

public class LongestPalindromSubSequ {

	public static int printPalin(String s) {
		
		return palindrom(s, 0, s.length()-1);
	}
	
	public static int palindrom(String s, int currIndex, int lastIndex) {
		
		if(currIndex>lastIndex) // If we have traversed more than 1/2 of string then return 0 as we dont need to process it
			return 0;
		if(currIndex == lastIndex) //If both the index are at same position then its a palindrome as its 1 character.
			return 1;
		
		int p3 = 0;
		if(s.charAt(currIndex) == s.charAt(lastIndex)) {
			p3 = 2 +  palindrom(s, currIndex + 1, lastIndex - 1);
		}
		
		int p1 = palindrom(s, currIndex, lastIndex - 1);
		int p2 = palindrom(s, currIndex + 1, lastIndex);
		
		return Math.max(p3,  Math.max(p1, p2));
	}
	
	
	public static void main(String[] args) {
	 String s = "ELRMENMET"; 	
	 System.out.println(printPalin(s));
	}

}
