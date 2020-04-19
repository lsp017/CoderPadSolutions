
public class SmlestSbArrGrtrTnVal {
	public static void main(String[] args) {
		int arr[] = {1, 4, 45,55, 6, 0, 19};
		int val = 51;
		int len = arr.length;

		// initialize sum,start,end to 0 and minlen =arr.lenth
		int sum =0;
		int start = 0;
		int end = 0;
		int minLen=len+1;
	// iterate through whole array O(n)
		while(end<len) {

			//add to the sum till its value is greater than given value and also increment end
			while(sum<=val && end<len) {
				//to check negative number
				if(sum<0 && val>0) start =end;
				sum+=arr[end++];
			}
			
			//Once sum>val, check minlen of a array where it satisfies.O(n)
			while(sum>val && start<len) {
				int size = end-start;
				if(size<minLen) minLen=size;
				sum = sum-arr[start++];
			}
		}
		//Total = O(n+n) = O(2n) = O(n)
		
		System.out.println("MinLength: " + minLen);
	}
}
