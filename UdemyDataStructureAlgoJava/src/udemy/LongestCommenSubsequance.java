package udemy;

public class LongestCommenSubsequance {

	public static int printSub(String s1, String s2) {
		return subSequance(s1, s2, 0, 0);	
	}
	
	public static int subSequance(String s1, String s2, int startingS1, int startingS2 ) {
		
		if(startingS1 == s1.length() || startingS2 == s2.length())
			return 0;
				
		int sub3 = 0;
		if(s1.charAt(startingS1) == s2.charAt(startingS2)) {           // if first character from both string match
		sub3 = 1 + subSequance(s1, s2, startingS1 + 1, startingS2 + 1); 
		}
		
		int sub1 = subSequance(s1, s2, startingS1 + 1, startingS2);
		int sub2 = subSequance(s1, s2, startingS1, startingS2 + 1);
		
		return Math.max(sub3, Math.max(sub2, sub1));
		
	} 
	public static void main(String[] args) {
		String s1 = "elephant";
		String s2 = "eretpat";
		
		System.out.println(printSub(s1,s2));
	}

}
