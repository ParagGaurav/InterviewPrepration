package JAVAProgram;

import java.util.HashMap;
import java.util.Map;

public class ST5 {

	public static void main(String[] args) {
		
		String s1 = "abcde"; //m
		String s2 = "bcad"; //n M*n
		String t ="";
		
		boolean flag = false;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				t = t + s1.charAt(i);
			}
			flag = false;
		}
		System.out.println(t);
		
		//using hashmap time complexity O(n) space complexity O(n)
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			hm.put(s1.charAt(i), 1);
		}
		
		for(int i=0;i<s2.length();i++) {
			if(hm.containsKey(s2.charAt(i))) {
				hm.put(s2.charAt(i), -1);
			} else {
				hm.put(s2.charAt(i), 2);
			}
		}
		for(Map.Entry<Character, Integer> table : hm.entrySet()) {
			if(table.getValue() == 1) {
				System.out.print(table.getKey() + " ");
			}
		}
		System.out.println();
		
		
		
		int sum = 0;
		for(int i=0;i<s1.length();i++) {
			sum = sum+ s1.charAt(i);
		}
		int sum2 = 0;
		
		for(int i=0;i<s2.length();i++) {
			sum2 += s2.charAt(i);
		}
		char c = (char) (sum - sum2);
		System.out.println(c);
		
	}
}
			
		
		
					
			