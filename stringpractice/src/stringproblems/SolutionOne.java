package stringproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/** 
 *  Solution provided in blog to find duplicate charters in String
 */
public class SolutionOne {
	
	public static void main(String[] args){
		if(args.length!=0){
			String str = args[0];
			Map<Character,Integer> m = new HashMap<Character,Integer>();
			for(int i= 0; i<str.length();i++){
				if(m.containsKey(str.charAt(i))){
					m.replace(str.charAt(i), m.get(str.charAt(i))+1);
				}else{
					m.put(str.charAt(i), 1);
				}
			}
			for(Entry<Character, Integer> e: m.entrySet()){
				System.out.println(e.getKey()+" "+e.getValue());
			}
			/*for(Character c: m.keySet()){
				System.out.println(c+" "+m.get(c));
			}*/
		}else{
			System.out.println("String Not provided");
		}
	}

}
