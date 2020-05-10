public class LargestThreeEle {

	public static void main(String[] args) {
		int arr[] = {10,9,1,2,8,4,6,3,20,14};
		int firstLargest = Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE,thirdLargest=Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length ;i++) {
			if(arr[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=firstLargest ) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}
			else if(arr[i]>thirdLargest && arr[i]!=firstLargest && arr[i]!=secondLargest ) {
				thirdLargest = arr[i];
			}
		}
		System.out.println(firstLargest+ " " + secondLargest +" " + thirdLargest );
	}

}
