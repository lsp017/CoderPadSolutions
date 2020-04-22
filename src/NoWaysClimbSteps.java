
public class NoWaysClimbSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 4;
		
		twoWayClimbing(steps);
		threeWayClimbing(steps);
		
	}
	
private static void threeWayClimbing(int steps) {
	int[] arr = new int[steps];
	arr[0] =1;
	arr[1] =2;
	arr[2] =4;
	
	for(int i=3;i<steps;i++) {
		arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
	}
	
	System.out.println("max 3 steps climbing to reach nth step " + arr[steps-1]);
}
//It follows Fibonnaci sequence
	private static void twoWayClimbing(int steps) {
		// TODO Auto-generated method stub
		int[] arr = new int[steps];
		arr[0] =1;
		arr[1] =2;
		
		for(int i=2;i<steps;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		System.out.println("max 2 steps climbing to reach nth step " + arr[steps-1]);
	}
}
