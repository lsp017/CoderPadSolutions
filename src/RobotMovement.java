

/*"Position of robot after given movements
Given a robot which can only move in four directions, UP(U), DOWN(D), LEFT(L), RIGHT(R). Given a string consisting of instructions to move. Output the co-ordinates of robot after the executing the instructions. Initial position of robot is at origin(0, 0).
Input : move = ""UDDLRL"" 
Output : (-1, -1)
Input : move = ""UDDLLRUUUDUURUDDUULLDRRRR""
Output : (2, 3)"
*/

public class RobotMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "UDDLLRUUUDUURUDDUULLDRRRR";
		int i=0,j=0;
		for(char c: str.toCharArray()) {
			switch(c) {
			case 'U' : i++; 
				break;
			case 'D' : i--;
				break;
			case 'L' : j--;
				break;
			case 'R' : j++;
				break;
			default :break;	
				
			}
		}
		
		System.out.println("output [" +j+ ","+i +"]");
		
	}

}
