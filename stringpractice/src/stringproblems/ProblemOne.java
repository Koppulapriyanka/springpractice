package stringproblems;
/** 
 * My Solution to find duplicate charters in String
 */
public class ProblemOne {
	
	public static void main(String[] args) {
		String str = null;
		int count;
		if(args.length != 0){
			str = args[0];
			for(int i=0; i<str.length()-1; i++){
				System.out.println("FirstLoop");
				count  = 0;
				for(int j =i+1; j<str.length(); j++){
					System.out.println("SecondLoop");
					if(str.charAt(i)==str.charAt(j)){
						System.out.println("InsideIf");
						count++;
						if(count == 1)
							System.out.println(str.charAt(i));
						str = str.substring(i,j)+str.substring(j+1);						
					}
				}
			}
		}else{
			System.out.println("String not provided");
		}
	}

}
