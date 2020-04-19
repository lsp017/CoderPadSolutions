import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringFindRepeatedPrograms {
	public static void main(String[] args) {
		
		String str = "tofindrepeatednonrepaetedLastrepeataLAstNonRepeatedMostRepeatedk";
		
		//FirstRepeated
		FindFirstRepeated(str);
		
		FindFirstNonRepeated(str);
		
		FindLastRepeated(str);
		FindLastNonRepeated(str);
		FindMostRepeated(str);
	}

	private static void FindFirstRepeated(String str) {
		Set<Character> set = new HashSet<>();
	
		for(char c : str.toCharArray()) {
			if(set.contains(c)) {
				System.out.println("FirstRepeatedChacter is : " + c);
				break;
			}
			else
				set.add(c);
		}
		
	}

	private static void FindFirstNonRepeated(String str) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(map.containsKey(c)) 
				map.put(c,map.get(c)+1);
			else 
				map.put(c, 1);
			}
		for (int i = 0; i<str.length(); i++) {
			if(map.get(str.charAt(i))==1) {
				System.out.println("FirstNonRepeatedChacter is : " + str.charAt(i));
				break;
			}
		}

		
	}

	private static void FindLastRepeated(String str) {
		Set<Character> set = new HashSet<>();
		char lastRepeated=str.charAt(0);
		for(char c : str.toCharArray()) {
			if(set.contains(c)) {
				lastRepeated = c;
			}
			else
				set.add(c);
		}		
		System.out.println("LastRepeatedChacter is : " + lastRepeated);		
	}

	private static void FindLastNonRepeated(String str) {

		Map<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(map.containsKey(c)) 
				map.put(c,map.get(c)+1);
			else 
				map.put(c, 1);
			}
		for (int i = str.length()-1; i >=0; i--) {
			if(map.get(str.charAt(i))==1) {
				System.out.println("LastNonRepeatedChacter is : " + str.charAt(i));
				break;
			}
		}
	}

	private static void FindMostRepeated(String str) {
		Map<Character,Integer> map = new HashMap<>();
		int max =Integer.MIN_VALUE;
		char mostRepeated=' ';
		for(char c : str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
				if(max<map.get(c)) {
					max=map.get(c);
					mostRepeated = c;
				}
			}
			else 
				map.put(c, 1);
			}
		System.out.println("Most rrepeated char is: " + mostRepeated + " occured " +map.get(mostRepeated));
	}

}
