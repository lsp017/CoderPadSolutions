import java.util.Collections;
import java.util.PriorityQueue;

public class KthLrgstSmlstElmnt {

	public static void main(String[] args) {
		int[] arr = {3,2,4,1,7,8,9,10,5,16,104,24,32};
		PriorityQueue<Integer> smallest = new PriorityQueue<Integer>();
		PriorityQueue<Integer> largest = new PriorityQueue<>(Collections.reverseOrder());
		
		int KthLargestSmallest=2;
		
		for(int i : arr) {
			smallest.add(i);
			largest.add(i);
		}
		
		while(KthLargestSmallest>1) {
			smallest.poll();
			largest.poll();
			KthLargestSmallest--;
		}
		
		System.out.println("Kth smallest element is "+ smallest.poll() + " & largest is " + largest.poll());
	}

}
