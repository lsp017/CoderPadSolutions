import java.util.HashMap;
import java.util.Map;

public class RunningLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcd";
		String res = new String();
		Map<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else
				map.put(c, map.get(c)+1);
		}
		
		map.forEach((k,v)->System.out.print(k.toString() + v.toString()));		
	}

}
