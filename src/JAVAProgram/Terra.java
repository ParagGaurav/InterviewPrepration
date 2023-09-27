package JAVAProgram;

public class Terra {
	
	//Find difference between two strings
	//Given two strings, where the second string is constructed using all characters of the first string except one, find the character that was skipped in the second string.
	//For example,
	//Input: first = ‘abc’, second = ‘ac’    Output: b
	//Input: first = ‘a’, second = ”    Output: a

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i =0; i<a.length;i++) {
			
			System.out.print(a[i][i] + " ");
		}
		int j = a.length-1;
		
		for(int i = 0; i<a.length;i++) {
			
			System.out.println(a[i][j]);
			
			j--;
		}
		
		
		
		
		
		
	}
		
}
		
		
		