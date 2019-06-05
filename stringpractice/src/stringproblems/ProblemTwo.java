package stringproblems;

import java.util.Arrays;
/** 
 * One of the Solution to find if two strigs are Anagrams
 */
public class ProblemTwo {
	
	public static void main(String[] args){
		if(args.length==2){
			char[] c1 = args[0].toLowerCase().toCharArray();
			char[] c2 = args[1].toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)){
				System.out.println("These Strings are Anagrams to each other");
			}else{
				System.out.println("These are not anagrams");
			}
		}else{
			System.out.println("Two Strings are Not provided");
		}
	}

}
