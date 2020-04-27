import java.util.Arrays;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "aabbbbbbbCDaaaaaaaaaaaaaaA";

		int longestSubString[] = getLongestSubString(str);
		System.out.println(Arrays.toString(longestSubString));

	}

	private static int[] getLongestSubString(String str) {
		
		int maxLen=0;
		int max =0;
		int[] res = new int[2];
		if(str== null ||str.length() == 0 ) {
			res[0]=0;
			res[1]=-1;
			return res;
		}
		
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				maxLen =1;
				int j = i+1;
				while(j < str.length()-1 && str.charAt(j)==str.charAt(i)) {
					j++;
					maxLen++;
				}
			}
			if(maxLen>max) {
				max = maxLen;
				res[0] = i;
				res[1] = max;
			}
		}
	//aabbbbbCDaA
		
		return res;
	}
}
