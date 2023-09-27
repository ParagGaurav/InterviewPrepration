package JAVAProgram;

public class ST2 {

	public static void main(String[] args) {

		String s1 = "paragg";
		String s2 = "paragg";
		boolean q = true;
	
			
		
		for (int i = 0; i < s1.length(); i++) {
		if (s1.charAt(i) == s2.charAt(i)) {

				q = true;

			} else {

				q = false;
				break;
				
			}

		}
		System.out.print(q);

	}
}
