import java.util.Arrays;

public class Move0sEnd {

	public static void main(String[] args) {
		int[] arr =new int[] {0,1,4,0,5,6,3,0,0};
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}

		while(count<arr.length) {
			arr[count++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
