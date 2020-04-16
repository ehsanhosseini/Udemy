package udemy;

public class NumPathToTwoDArray {

	public static int printPath(int[][] arr, int cost) {
		return numPath(arr, arr.length-1, arr[0].length-1, cost );
	}
	
	public static int numPath(int[][] arr, int row, int col, int cost ) {
		if(cost<0)
			return 0;
		
		if(row == 0 && col == 0) {
			if(arr[0][0] - cost == 0)
				return 1;
			else 
				return 0;
			//return (arr[0][0] - cost == 0)?1:0;
		}
		
		if(row == 0) {
			return numPath(arr, 0, col-1, cost - arr[row][col]);
		}
		
		if(col == 0) {
			return numPath(arr, row - 1, col, cost - arr[row][col]);
		}
		
		int path1 = numPath(arr, row - 1, col, cost - arr[row][col]);
		int path2 = numPath(arr, row, col - 1, cost - arr[row][col]);
		
		return path1 + path2;
	}
	
	public static void main(String[] args) {
		int[][] arr = { 
				  { 4, 7, 1, 6 }, 
				  { 5, 7, 3, 9 }, 
				  { 3, 2, 1, 2 }, 
				  { 7, 1, 6, 3 } };
		System.out.println(printPath(arr, 25));
		
	}

}
