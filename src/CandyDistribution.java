import java.util.Arrays;

public class CandyDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2};
		
		int[] left_right = new int[arr.length];
		int[] right_left = new int[arr.length];
		
		int[] minCandiesArr = new int[arr.length];

		Arrays.fill(left_right, 1);	
		Arrays.fill(right_left, 1);
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				left_right[i] = left_right[i-1]+1;
			}
		}
		for (int i =arr.length-2 ; i >=0; i--) {
			if(arr[i]>arr[i+1]) {
				right_left[i] = right_left[i+1]+1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			minCandiesArr[i] =Math.max(left_right[i], right_left[i]);	 
		}	
		
		System.out.println(Arrays.toString(left_right));
		System.out.println(Arrays.toString(right_left));
		System.out.println(Arrays.toString(minCandiesArr));
		System.out.println(Arrays.stream(minCandiesArr).sum()); 
	}

}
