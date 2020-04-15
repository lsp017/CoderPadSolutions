
public class Factorial {

	public static void main(String[] args) {
			//Factorial of a number 5 = 5*4*3*2*1 = 120
		
		int fact =5;
		//Iterative approach
		FactIterative(fact);
		
		//recursive approach
		System.out.println(FactRecursive(fact));
		
	}

	private static int FactRecursive(int fact) {
		if(fact==0) {
			return 1;
		}

		return fact * FactRecursive(fact-1);
		
	}

	private static void FactIterative(int fact) {
		int res=1;
		for(int i=1 ;i<=fact;i++) {
			res*=i;
		}
		System.out.println("factIterative : " + res);		
	}

}
