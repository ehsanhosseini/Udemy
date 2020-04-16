package udemy;

public class LongestPlindSubstring {
public static int printPalin(String s) {
		
		return palindrom(s, 0, s.length()-1);
	}
	
	public static int palindrom(String s, int currIndex, int lastIndex) {
		
		if(currIndex>lastIndex) 
			return 0;
		if(currIndex == lastIndex) 
			return 1;
		
		int p3 = 0;
		if(s.charAt(currIndex) == s.charAt(lastIndex)) {
			int reminingPali = lastIndex - currIndex -1;
			if(reminingPali == palindrom(s, currIndex + 1, lastIndex - 1) ) {
				p3 = 2 + reminingPali;
			}
		}
		
		int p1 = palindrom(s, currIndex, lastIndex - 1);
		int p2 = palindrom(s, currIndex + 1, lastIndex);
		
		return Math.max(p3,  Math.max(p1, p2));
	}
		
	public static void main(String[] args) {
		 String s = "MQADASM"; 	
		 System.out.println(printPalin(s));

	}

}
