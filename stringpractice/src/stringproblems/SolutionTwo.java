package stringproblems;

/**
 * 
 * Solutions provided in blog to solve two strings are angrams of each other
 *
 */
public class SolutionTwo {
	
	 public boolean isTwoStringAreAnagrams1(String word, String anagram){
		 if(word.length() != anagram.length()){
			 return false;
		 }else{
			 char[] c = word.toCharArray();
			 for(int i=0;i<word.length();i++){
				int index = anagram.indexOf(c[i]);
				if(index != -1){
					anagram = anagram.substring(0,index)+anagram.substring(index+1);
				}else{
					return false;
				}
			 }
			 return anagram.isEmpty();
		 }
		 
	 }

}
