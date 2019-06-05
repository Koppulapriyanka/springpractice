package stringproblems;

import java.util.HashMap;
import java.util.Map;

/** 
 * 
 * My Solution to find first non repeated character in String
 *
 */
public class ProblemThree {
	
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
			for(Character c: m.keySet()){
				if(m.get(c)==1){
					System.out.println(c);
					break;
				}
			}
		}else{
			System.out.println("String Not provided");
		}
	}


}
