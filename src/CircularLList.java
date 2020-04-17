
import java.util.Scanner;

/*
 Group of students sitting in circle and teacher wants to elect a new President,
 she will walk around the circle while singing song and where the song ends that particular student will be removed
  and this will be continued till the last student remaining and would be elected as President.
   For Example: There are 4 students n = [1,2,3,4], and the length of song ie k = 2,
   so first student that has to be removed is 2 and then 4 and then 3, So the student 1 will be the president.
    Following are the test cases and k=testCases[2]
         Test cases: [1,3,4,6,2,5,9]
         step1:[1,4,6,2,5,9]  //3
         step2:[1,4,2,5,9]   //6
         step3:[1,4,2,9]  //5
         step4:[4,2,9]
         step5:[4,9]
         step5:[4]
*/
public class CircularLList {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of students");
        int size = sc.nextInt();
        int i = sc.nextInt();
        Linkedlist ll = new Linkedlist(i);
        Linkedlist head = ll;
        while(--size>0){
            i = sc.nextInt();
            ll.next = new Linkedlist(i);
            ll=ll.next;
        }
        // joining circular linked list
        ll.next=head;
        Linkedlist curr,prev;
        curr=head.next;
        prev=head;

        while (head.next!=null){
           System.out.println("Eliminated : "+ curr.data);
            prev.next=curr.next;
            prev=curr.next;
            curr=prev.next;
            if(curr.next==prev.next) break;
        }
        System.out.println("president will be : " +prev.data);
    }
}

class Linkedlist{
    int data;
    Linkedlist next;

    Linkedlist(int data){
        this.data = data;
        next=null;
    }
}