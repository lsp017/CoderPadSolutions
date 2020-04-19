
public class SquareRoot {
	static int x=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;	
		double guess = 11;
		System.out.println(Math.sqrt(x));
		while(count<10) {
			guess = guess-(fun1(guess)/fun2(guess));
			count++;
			System.out.println(guess);
		}
	}
	
	public static double fun1(double e) {
		return (e*e)-x;
	}

	public static double fun2(double e) {
		return 2*e;
	}
	
	
}
