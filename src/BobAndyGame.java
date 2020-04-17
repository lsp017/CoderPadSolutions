
import java.util.*;

public class BobAndyGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(--size>=0){
            list.add(sc.nextInt());
        }

        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int i : list){
            pq.add(i);
        }
        int count=0;
        while(list.size()>0){
            count++;
            //get the max value using java 8
            Optional<Integer> max = list.stream().max(Integer::compareTo);
            //or get the max value form a max heap and get the index of that in an array and delete the rest.
            for (int i = list.indexOf(pq.poll()); i <list.size() ;) {
                pq.remove(list.get(i));
                list.remove(i);
            }
        }
        if((count%2)==0) System.out.println("ANDY");
        else
            System.out.println("BOB");
    }

}
