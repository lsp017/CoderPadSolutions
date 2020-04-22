import java.util.Arrays;

public class MedianSrtdArr {

	public static void main(String[] args) {
		int[] arr1 = {1,2,5,6,8,10,24,27,29};
		int[] arr2 = {3,4,7,11,12,14,16,27};
		int len = arr1.length+arr2.length;		
		int[] res = new int[len];
		int i=0;
		int avg=0;
		int a=0,b=0;
		for(;i<len && a<arr1.length && b<arr2.length ;i++) {
			if(arr1[a]<=arr2[b]) 
				res[i]=arr1[a++];
			else
				res[i]=arr2[b++];
		}
		
		while(a<arr1.length)
			res[i++] =arr1[a++];
		while(b<arr2.length)
			res[i++] = arr2[b++];

		System.out.println(Arrays.toString(res));

		if(len%2==0){
			System.out.println("Median of even length is " + (res[len/2]+res[(len/2)-1])/2);
		}
		else
			System.out.println("Median of odd length is " + res[len/2]);
		
	}

}
