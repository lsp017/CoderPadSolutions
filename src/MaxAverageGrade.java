import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/*"Question 1: Implement a function to calculate best average score of students. Score can be in negative values as well:

Input given: [[""Bobby"",87],[""Charles"",100],[""Eric"",64],[""Charles"",22]]
Output: 87 "
*/
public class MaxAverageGrade {

	public static void main(String[] args) {
		String scores[][] = 
				{{"jerry","65"},
				{"bob","91"}, 
				{"jerry","23"}, 
				{"Eric","3"},
				{"bob","73"},
				{"enrique","45"},
				{"bob","42"},
				};
		int len = scores.length;
		Map<String,List<Integer>> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			String name = scores[i][0];
			Integer score = Integer.valueOf(scores[i][1])  ;
			
			if(!map.containsKey(name)) {
				List<Integer> list = new ArrayList<>();
				list.add(score);
				map.put(name, list);
			}
			else {
				map.get(name).add(score);
			}
			
		}
		
		int maxAvg = Integer.MIN_VALUE;
		String maxAvgName=null;
		for(Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			List<Integer> l2 = entry.getValue();
			Optional<Integer> sum = l2.stream().reduce((a,b) -> a+b);
			int avg = (sum.get()/l2.size());
			
			if(avg >maxAvg) {
				maxAvg = avg;
				maxAvgName = entry.getKey();
			}
			
		}
		
		
		System.out.println("MAxAvg is :" + maxAvg + " by " + maxAvgName);
		
}
}
