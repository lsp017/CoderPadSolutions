import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		findMinWinSbString(s,t);

	}

	private static void findMinWinSbString(String s, String t) {
		char[] ch = t.toCharArray();
		int start=0,end=0;
		int min=Integer.MAX_VALUE;
		int count =0;
		List<Character> temp = new ArrayList<>();
		for(char c : ch) {
			temp.add(c);
		}
		
		for(int i=0;i<s.length();i++)
		{
			List<Character> list = new ArrayList<Character>(temp);
//			System.out.println(list.toString());
			int j=i;
			while(j<s.length() && list.size()>0) {
				if(list.contains(s.charAt(j))) {
					Character c = new Character(s.charAt(j));
					list.remove(c);
				}
				j++;
				count++;
			}
			
			if(count<min && list.size()==0) {
				min =count;
				start = i;
				end = j;
			}
			count=0;
			
//			System.out.println(start);
//			System.out.println(end);
		}
		
		System.out.println("MinWindowSubstring : "+s.substring(start,end));
	}

}
