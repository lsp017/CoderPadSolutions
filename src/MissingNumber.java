import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=  {0,1,2,3,4,7,9};
		int len = arr.length;
		int ind = arr[len-1];
		int[] temp = new int[ind+1];
		
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]]=1;
		}
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i]==0) {
				System.out.println(i);
			}
		}
		
}
}
