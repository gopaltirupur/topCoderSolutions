package srm_732_div_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DeckOfCards {
	String perfect = "Perfect";
	String notPerfect = "Not perfect";
	public String IsValid(int n, int[] value, String suit){
		Map<Character,List<Integer>> map1 = new TreeMap<>();
		Map<Integer,List<Character>> map2 = new TreeMap<>();
		int i = 0;
		for(char c : suit.toCharArray()){
			if(!map1.containsKey(c)){
				map1.put(c, new ArrayList());				
			}
			if(map1.get(c).contains(value[i])){
				return notPerfect;
			}else{
				map1.get(c).add(value[i]);
			}
			
			if(!map2.containsKey(value[i])){
				map2.put(value[i],new ArrayList());
			}
			if(map2.get(value[i]).contains(c)){
				return notPerfect;
			}else{
				map2.get(value[i]).add(c);
			}
			i++;
		}
		List<Character> charKeySet = new ArrayList<>(map1.keySet());		
		if(charKeySet.size()==1){
			return perfect;
		}else{			
			for(int j=0;j<charKeySet.size()-1;j++){
				for(int k=j;k<charKeySet.size();k++){
					List<Integer> l1Integer = map1.get(charKeySet.get(j));
					List<Integer> l2Integer = map1.get(charKeySet.get(k));
					for(Integer charValue : l1Integer){
						if(!l2Integer.contains(charValue)){
							return notPerfect;
						}
					}
				}
			}
		}
		return perfect;
	}
}
