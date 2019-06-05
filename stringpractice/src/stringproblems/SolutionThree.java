package stringproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * Solution provided in blog to solve first non repeated character in String
 *
 */
public class SolutionThree {
	
	public char firstFindNonrepeatedChar1(String word){
		Map<Character,Integer> m = new LinkedHashMap<Character,Integer>();
		char[] carr= word.toCharArray();
		for(char c:carr){
			m.put(c, m.containsKey(c)? m.get(c)+1:1);
		}
		for(Entry<Character, Integer> e: m.entrySet()){
			if(e.getValue()==1){
				return e.getKey();
			}
		}
		return 0;
	}
	
	public char firstFindNonreapetedChar2(String word){
		Set<Character> reapeated = new HashSet<Character>();
		List<Character> nonReapeated = new ArrayList<Character>();
		char[] carr= word.toCharArray();
		for(char c:carr){
			if(reapeated.contains(c)){
				continue;
			}
			if(nonReapeated.contains(c)){
				nonReapeated.remove(c);
				reapeated.add(c);
			}else{
				nonReapeated.add(c);
			}
		}
		return nonReapeated.get(0);
		
	}

}
