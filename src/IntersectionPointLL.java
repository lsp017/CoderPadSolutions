/*Linked list 
1--2--4--6--8--9
      		|
	   0--3--

intersection point 4;
*/


public class IntersectionPointLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node LL1 = new Node(1);
		LL1.next = new Node(2);
		LL1.next.next = new Node(4);
		LL1.next.next.next = new Node(6);
		LL1.next.next.next.next = new Node(8);
		LL1.next.next.next.next.next = new Node(9);

		Node LL2 = new Node(0);
		LL2.next = new Node(3);
		LL2.next.next =LL1.next.next.next.next; 
		
		FindInterLL(LL1,LL2);
	}

	private static void FindInterLL(Node LL1, Node LL2) {
		// TODO Auto-generated method stub
		/* space optimized soln*/
		Node headLL1 = LL1;
		Node headLL2 = LL2;
		int lenLL1 =0;
		int lenLL2 =0;

		Node Intersecion = LL1;
		
		int diff =0;
		while(LL1!=null) {
			lenLL1++;
			LL1 = LL1.next;
		}

		while(LL2!=null) {
			lenLL2++;
			LL2 = LL2.next;
		}
		
		diff = Math.abs(lenLL1-lenLL2);
		
		if(lenLL1>=lenLL2) {
			while(diff>0) {
				headLL1 = headLL1.next;
				diff--;
			}
			Intersecion = find(headLL1,headLL2);
		}
		else {
			while(diff>0) {
				headLL2 = headLL2.next;
				diff--;
			}
			Intersecion = find(headLL2,headLL1);
		}
		
		System.out.println(Intersecion.data);
	}

	private static Node find(Node headLL1, Node headLL2) {
		
		while(headLL1!=null && headLL2!=null) {
			if(headLL1 == headLL2)
				return headLL1;
			headLL1 = headLL1.next;
			headLL2 = headLL2.next;
		}
		
		return null;
	}

}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data =data;
		next=null;
	}
}
