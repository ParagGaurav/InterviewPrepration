package JAVAProgram;

public class TwD {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int q = 0;
		
		
		
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				q = q+ a[i][j] ;
				
				
			
				
				System.out.print(a[i][j]+ " ");
				
				
				
			}
			System.out.println();
			
		}
		System.out.println(q);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					System.out.print(a[i][j]+ " ");
				}
			}
		}
		System.out.println("**********");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i][i]+ " ");
		}
		System.out.println();
		int j =a.length-1;
		for(int i =0;i<a.length;i++) {
			
			System.out.print(a[i][j]+ " ");
			j--;
		}
		
			
		
		

	}

}
