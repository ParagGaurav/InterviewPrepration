package JAVAProgram;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	
	public static void main (String[] args){

			String s = "paraggaurav";
			Set<Character> set = new HashSet<>();
			
			for(int i=0;i<s.length(); i++) {
				
				set.add(s.charAt(i));
			}
			System.out.println(set);
			

	}
}
