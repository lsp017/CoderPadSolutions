import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Segregate01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[] {0,1,1,0,1,1,1,0,0};
		int left = 0, right = arr.length-1;
		while(left<right) {
			while(arr[left]==0 && left<right) {
				left++;
			}
			while(arr[right]==1 && left<right) {
				right--;
			}
			arr[left] = 0;
			arr[right] = 1;
		}
//		List<int[]> ls = Arrays.asList(arr);
//		Iterator<int[]> itr = ls.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for (int i = 0;  i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
