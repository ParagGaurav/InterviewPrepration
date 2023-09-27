package JAVAProgram;

public class Output {

	public static void main(String[] args) {
		String s1 = "parag";
		String s2 = "parag";
				
			System.out.println(s1==s2);
			
			String s3 = new String ("ayushi");
			String s4 = new String ("ayushi");
			
			System.out.println(s3==s4); // false
			System.out.println(s3.equalsIgnoreCase(s4)); // true
			

	}
}
