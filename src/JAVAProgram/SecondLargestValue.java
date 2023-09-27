package JAVAProgram;

public class SecondLargestValue {
	
	
	
	public static void main(String[] args) {
		
		int a[] = {1,1,1,1};
		int m = largeValue(a);
		System.out.print(m);
		
		
		
	}
	
	private static int largeValue(int[] a) {
		int second = Integer.MIN_VALUE;
		int first = Integer.MIN_VALUE;
		for(int i=0; i<a.length;i++) {
			
			if(a[i]> first) {
				
				first = a[i];
				
				
			}else if(a[i]>second && a[i]!=first) {
				second = a[i];
			}
			
		}
		
		
		
		return second == Integer.MIN_VALUE ?
				
				first : second;
		
	}
	
}
	
	
	

	
		
		
		
	




