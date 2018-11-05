package srm_731_div_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RingLex {
	
	public String getmin(String s){		
		List<Integer> primesLessThanLength = getPrimeNumbers(s.length()-1);
		
		Set<String> set = new HashSet<>();
		for(int x=0;x<s.length();x++){						
			for(int p:primesLessThanLength){
				String ns = "";
				for(int i = 0;i<s.length();i++){
					ns += s.charAt((x+i*p)%s.length());
				}
				set.add(ns);
			}
		}
		List<String> list = new ArrayList<>(set);
		Collections.sort(list);				
		return list.get(0);
	}
	
	private List<Integer> getPrimeNumbers(int end){
		List<Integer> output = new ArrayList<Integer>();
		output.add(2);
		for(int i = 3;i<=end;i++){
			int j = 2;
			for(;j<i;j++){
				if(i%j==0){
					break;
				}
			}
			if(j==i){
				output.add(i);
			}
		}
		return output;
	}	
}