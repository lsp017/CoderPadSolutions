import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		//fibonacci series of 5  {0, 1, 1, 2, 3}	
		
		//Iterative approach
		int fib =5;
		
//		fibIterative(fib);
		
System.out.println(fibRecursive(fib));		

		fibDynamicProgramming(fib);
	}

	private static void fibDynamicProgramming(int n) {
		int[] arr = new int[n];
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println(Arrays.toString(arr));
	}

	private static int fibRecursive(int fib) {
		// TODO Auto-generated method stub
		if(fib<=1) {
			return fib;
		}
		return fibRecursive(fib-1)+ fibRecursive(fib-2);
	}

	private static void fibIterative(int fib) {
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=2;i<fib;i++) {
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
