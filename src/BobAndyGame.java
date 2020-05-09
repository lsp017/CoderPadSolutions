
import java.util.*;

/*
 * "Andy wants to play a game with his little brother, Bob. The game starts with an array of distinct integers and the rules are as follows:

Bob always plays first and the two players move in alternating turns.
In a single move, a player chooses the maximum element currently present in the array and removes it as well as all the other elements to its right. For example, if the starting array arr =[2,3,5,4,1], then it becomes arr=[2,3] after the first move because we remove the maximum element (i.e., 5) and all elements to its right (i.e., 4 and 1).
The modifications made to the array during each turn are permanent, so the next player continues the game with the remaining array. The first player who is unable to make a move loses the game.
Andy and Bob play 'g' games. Given the initial array for each game, find and print the name of the winner on a new line. If Andy wins, print ANDY; if Bob wins, print BOB.

To continue the example above, in the next move Andy will remove 3. Bob will then remove 2 and win because there are no more integers to remove.

Function Description

Complete the gamingArray function. It should return a string that represents the winner, either ANDY or BOB.

gamingArray has the following parameter(s):
arr: an array of integers 

Test cases:
Test case1: 5 2 6 3 4
Test case2: 3 1

Test Result:
ANDY
BOB

For Example:
Initial array:
[5 2 6 3 4]
In the first move, Bob removes 6 and all the elements to its right, resulting in Arr= [5,2]
In the second move, Andy removes 5 and all the elements to its right, resulting in Arr = []:
At this point, the array is empty and Bob cannot make any more moves. This means Andy wins, so we print ANDY on a new line. "

 */


public class BobAndyGame {
	  static Stack<Integer> stk1  = new Stack<>();
	  static Stack<Integer> stk2  = new Stack<>();	
    public static void main(String[] args) {
    	AnotherSolution();
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the size of an array"); int size = sc.nextInt();
		 * List<Integer> list = new ArrayList<>(); while(--size>=0){
		 * list.add(sc.nextInt()); }
		 * 
		 * PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
		 * for(int i : list){ pq.add(i); } int count=0; while(list.size()>0){ count++;
		 * //get the max value using java 8 Optional<Integer> max =
		 * list.stream().max(Integer::compareTo); //or get the max value form a max heap
		 * and get the index of that in an array and delete the rest. for (int i =
		 * list.indexOf(pq.poll()); i <list.size() ;) { pq.remove(list.get(i));
		 * list.remove(i); } } if((count%2)==0) System.out.println("ANDY"); else
		 * System.out.println("BOB");
		 */
    }

	private static void AnotherSolution() {
		// TODO Auto-generated method stub
	    int arr[] ={6,2,3,5,4,1};
//	    int arr[] ={5,2,6,3,4};
	    //int arr[] ={3,1};    	    
	    boolean bob = true;
	    boolean andy = false;
	    
	    for(int i : arr){
	      if(stk1.isEmpty() && stk2.isEmpty()){
	        stk1.push(i);
	        stk2.push(i);
	        continue;
	      }
	      
	      if(i>stk2.peek()){
	        stk2.push(i);
	      }
	      stk1.push(i);
	    }
	      
	    while(!stk1.isEmpty() && !stk2.isEmpty()){
	      if(bob){
	        int ele = stk2.pop();
	        System.out.println("Bob Picks : "+ ele);
	        while(!stk1.isEmpty() && ele!=stk1.peek())
	          stk1.pop();
	        if(ele==stk1.peek()) stk1.pop();
	        if(!stk1.isEmpty())
	        bob = false;
	      }
	      else{
	        int ele = stk2.pop();
	        System.out.println("Andy Picks : "+ ele);
	        while(!stk1.isEmpty() && ele!=stk1.peek())
	          stk1.pop();
	        if(ele==stk1.peek()) stk1.pop();
	        if(!stk1.isEmpty())
	        bob = true;
	      }
	    if(!bob)
	      System.out.println("After Bob Plays remaining arr : " + stk1.toString());
	    else
	      System.out.println("After Andy Plays remaining arr : " + stk1.toString());
	     
	    }
	    
	    if(bob)
	      System.out.println("Bob Wins");
	    else
	      System.out.println("Andy Wins");
	    
		
		
	}

}

