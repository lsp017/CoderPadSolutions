
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface AnagramsGrouping {
	public Set<Set<String>> grouping(List<String> list);
}

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<String> inputList = Arrays.asList(input);
		Set<Set<String>> res = new HashSet<>();
		Map<String, Set<String>> resmap = inputList
				.stream()
				.collect(Collectors.groupingBy(s -> {
												char[] c = s.toCharArray();
												Arrays.sort(c);
												return new String(c);
											}, 
											Collectors.mapping(Function.identity(), Collectors.toSet())));
		resmap.forEach((k, v) -> res.add(v));
		System.out.println(res);
		/*
		 * resmap.forEach((k, v) -> res.add(v));
		 * 
		 * Map<String, List<String>> map = new HashMap<>(); for (String st : input) {
		 * 
		 * char[] ch = st.toCharArray(); Arrays.sort(ch); // TO convert char array to
		 * string , create a string object by passing char // araay to it String
		 * sortedChar = new String(ch);
		 * 
		 * if (!map.containsKey(sortedChar)) { List<String> list = new ArrayList<>();
		 * list.add(st); map.put(sortedChar, list); } else { List<String> list =
		 * map.get(sortedChar); list.add(st); map.put(sortedChar, list); } }
		 * map.forEach((k, v) -> System.out.println(v.toString()));
		 */
	}
}
