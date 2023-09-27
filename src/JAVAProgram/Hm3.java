package JAVAProgram;

import java.util.HashMap;
import java.util.Map;

public class Hm3 {

	public static void main(String[] args) {
		
		String s1 = "abcddee";
		String s2 = "abcde";
		
		
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			
			if(hm.containsKey(s1.charAt(i))){
				
				int c = hm.get(s1.charAt(i));
				 c = c+1;
				hm.put(s1.charAt(i), c);
				
			}else {
			
			hm.put(s1.charAt(i), 1);
			
			}
		} 
		
		for(int i =0;i<s2.length();i++) {
			if(hm.containsKey(s2.charAt(i))) {
				int c = hm.get(s2.charAt(i));
				c = c-1;
				hm.put(s2.charAt(i), c);
			}else {
				hm.put(s2.charAt(i), -1);
			}
		} 
		boolean f = true;
		for(Map.Entry<Character, Integer> table : hm.entrySet()) {
			if(table.getValue()==0) {
				f=true;
			}else {
				f=false;
			}
			
		}
		System.out.println(f);
				

	} 
	}
		


