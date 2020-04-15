
public class SecondSmallestNumber {

	public static void main(String[] args) {
		int arr[] = {10,9,1,2,8,4,6,3,20,14};
		int firstSmallest = Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;
		
		for(int i = 0;i<arr.length ;i++) {
			if(arr[i]<firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i]!=firstSmallest ) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("second Smallest Number in an array : "+ secondSmallest );
	}

}
