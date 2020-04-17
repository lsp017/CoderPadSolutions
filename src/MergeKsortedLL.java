import java.io.*;
import java.util.*;


public class MergeKsortedLL {
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) {

        LinkedListMK head = new LinkedListMK(1);
        head.next = new LinkedListMK(4);
        head.next.next =  new LinkedListMK(5);

        LinkedListMK head2 = new LinkedListMK(1);
        head2.next = new LinkedListMK(3);
        head2.next.next =  new LinkedListMK(4);

        LinkedListMK head3 = new LinkedListMK(2);
        head3.next = new LinkedListMK(6);

        LinkedListMK[] llArr = {head,head2,head3};
        pqAdd(head);
        pqAdd(head2);
        pqAdd(head3);


        LinkedListMK resLList = new LinkedListMK(pq.poll());
        LinkedListMK res = resLList;
        while(!pq.isEmpty()){
            resLList.next = new LinkedListMK(pq.poll());
            resLList = resLList.next;
        }
        resLList = res;

        while(resLList!=null){
            System.out.print(resLList.data + "-> ");
            resLList = resLList.next;
        }


    }

    public static void pqAdd(LinkedListMK node){
        while(node!=null){
            pq.add(node.data);
            node = node.next;
        }

    }

}

class LinkedListMK{
    int data;
    LinkedListMK next;
    LinkedListMK(int data){
        this.data=data;
        this.next=null;
    }
}
  