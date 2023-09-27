package JAVAProgram;

public class ST4 {
	
	public static void main(String[] args) {
		
		String s = "abcdcba";
		int j = s.length()-1;
		boolean b = true;
		
		for(int i=0;i<s.length()/2;i++) {
			
			if (s.charAt(i)==s.charAt(j)) {
			  b = true;
				
			 j--;
			}else {
				b = false;
				break;
			}
			
			
		
		}
		System.out.println(b);
		
	}

}
