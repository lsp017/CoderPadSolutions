import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,1,2,8,4,6,3,20};
		int len =arr.length;
		int left =0;
		int right = len-1;
		
		while(left<=right) {
			int temp = arr[left]; 
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
