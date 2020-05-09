import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {1,4,7,3,5,6};
		int[] a = {1,6,5};
		boolean subset = true;
		Set<Integer> set = new HashSet<>();
		for(int i : a)
			set.add(i);
		
	    List<String> input =Arrays.asList(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}) ;
		
		
		for(int i: b) {
			if(!set.contains(i))
				subset=false;
		}
		System.out.println("Are both the arrays are subset: " + subset);
	}
}
