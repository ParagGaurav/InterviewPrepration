package JAVAProgram;

import java.util.HashMap;
import java.util.Map;

public class Hm2 {
	
	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7,8,9,10,11,2,3,4,5,6,7};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			if(hm.containsKey(a[i])) {
				
				int c = hm.get(a[i]);
				c = c+1;
				hm.put(a[i], c);
			}else {
				
				if(a[i] % 5 != 0) {
					
					hm.put(a[i], 1);
				}
			}
			
			
		} for(Map.Entry<Integer,Integer> table : hm.entrySet()) {
			
			System.out.println("the count of the key "+ table.getKey()+ " "+ table.getValue());
			
			
		}
		
		
		
		
	}

}
