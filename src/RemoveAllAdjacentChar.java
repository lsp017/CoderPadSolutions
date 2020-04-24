import java.util.Stack;

/*
Input: azxxzy
Output: ay
First “azxxzy” is reduced to “azzy”.
The string “azzy” contains duplicates,
so it is further reduced to “ay”.

Input: caaabbbaacdddd  //cbbbaa
Output: Empty String

Input: acaaabbbacdddd //acac
Output: acac

*/


public class RemoveAllAdjacentChar {

	public static void main(String[] args) {
		String str="acaaabbbacdddd";
		int i=0;
		for(;i<str.length()-1;) {
			if(str.charAt(i)==str.charAt(i+1)) {
				int j = i+1;
				while(j<str.length() && str.charAt(i)==str.charAt(j) ) {
					j++;
				}
				str = str.substring(0,i)+str.substring(j);
				System.out.println(str);
				i=0;
			}
			else
				i++;
		}
		
		System.out.println("Result : " + str);
		
		/*
		 * Stack<Character> stk = new Stack<>(); int count=0; for(int
		 * i=0;i<input.length();i++){ char c = input.charAt(i); char d =
		 * input.charAt(i); if(stk.isEmpty()) stk.push(c);
		 * 
		 * else if(c!=d) { stk.push(c);
		 * 
		 * }
		 * 
		 * else if(stk.peek()==c){ count++; }
		 * 
		 * // System.out.println(stk.peek()); // System.out.println(count);
		 * if(stk.peek()!=c && count>0){ stk.pop(); count =0; }
		 * 
		 * } String ch = new String(); String.valueOf(stk.toArray());
		 */
	}

}
