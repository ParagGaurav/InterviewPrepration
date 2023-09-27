package JAVAProgram;

import java.util.HashMap;
import java.util.Map;

public class ST3 {

	public static void main(String[] args) {

		String s1 = "parag";
		String s2 = "parag";
		boolean b = true;
		pairingLetterForString();
		pairingLetterForUnEvenString();
		countCharacterOfstring("paraggaurav");
		

		if (s1.length() == s2.length()) {

			b = true;
			for (int i = 0; i < s1.length(); i++) {

				if (s1.charAt(i) == s2.charAt(i)) {

					b = true;
				} else {
					b = false;
				}

			}

		} else {
			b = false;
		}
		System.out.println(b);
	}
	public static void pairingLetterForString() {
		
		String s1 = "qwerty";
		String s2 = "ytrewq";
		
		String t = "";
		
		for(int i=0;i<s1.length();i++) {
			
			t = t + s1.charAt(i)+s2.charAt(i)+ " ";
			
		}
		System.out.println(t.toUpperCase());
	}
	
	public static void pairingLetterForUnEvenString() {
		String s1 = "qwerty";
		String s2 = "qwertyuiop";
		String t = "";
		for(int i = 0; i<s1.length() && i<s2.length(); i++) {
			
			t = t+s1.charAt(i)+s2.charAt(i)+" ";
			
			
		}
		if(s2.length()>s1.length()) {
			
			for(int i = s1.length();i<s2.length();i++) {
				t = t + s2.charAt(i);
			}
		}
		else if(s2.length()<s1.length()) {
			for(int i =s2.length(); i<s1.length();i++) {
				t = t + s1.charAt(i);
			}
		}
			
		System.out.println(t);
	}
	
	public static void countCharacterOfstring(String s) {
		
		s = "paraggaurav"; //n
		int count = 0;
		for(int i =0;i<s.length();i++) {
			
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;//1 2 3 4 5 6
				}
				
			}System.out.println("the count of "+ s.charAt(i) + count);
			
			count = 0;
			
			// 
			
		
		}System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		// using HashMap
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))){
				
				int c = hm.get(s.charAt(i));
				c = c+1;
				hm.put(s.charAt(i), c);
				
			}else {
				hm.put(s.charAt(i), 1);
			}
			
			
			
		}
		for(Map.Entry<Character, Integer> table : hm.entrySet()) {
			
			System.out.println("the count of "+table.getKey()+ " " + table.getValue());
		}
		
		
		
		
		
		
	}
	

}
