
public class SmlestSbArrGrtrTnVal {
	public static void main(String[] args) {
		int arr[] = {1, 4, 45,55, 6, 0, 19};
		int val = 51;
		int len = arr.length;
		int sum =0;
		int start = 0;
		int end = 0;
		int minLen=len+1;
		while(end<len) {
			System.out.println(end);
//			if(arr[end]>val) {
//				minLen=1;
//				break;
//			}
			while(sum<=val && end<len) {
				//to check negative number
				if(sum<0 && val>0) start =end;
				sum+=arr[end++];
			}
			
			while(sum>val && start<len) {
				int size = end-start;
				if(size<minLen) minLen=size;
				sum = sum-arr[start++];

			}
		}
		System.out.println("MinLength: " + minLen);
	}
}
