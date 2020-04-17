
public class SmlestSbArrGrtrTnVal {
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 0, 19};
		int val = 51;
		
		int sum =0;
		int start = arr[0];
		int end = arr[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			
			if(val>sum)
				sum+=arr[i];
			
		}
		
	}
}
