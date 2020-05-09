
public class LarrysArray {

	public static void main(String[] args) {
		int[] arr = {0,1,2,6,5,4,3};	
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1;j  < arr.length; j++) {
				if(arr[i]>arr[j])
					c += 1;
			}
			
		}
	    if (c%2==0)
	        System.out.println("YES");
	    else
	    	System.out.println("NO");
	}

}
