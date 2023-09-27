package JAVAProgram;

public class MinValue {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };

		int b = Integer.MIN_VALUE;

		System.out.println(minvalue(a));
	}

	private static int minvalue(int a[]) {

		int d = Integer.MAX_VALUE;
		int j = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {

			if (a[i] < d ) {

				d = a[i];

			}
			else if( a[i]<j && a[i] !=d){
				j = a[i];
				
			}
		}
		
			
		
		return j;
	}
	
}
