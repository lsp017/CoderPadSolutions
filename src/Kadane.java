
public class Kadane {
    public static void main(String args[]){
//        int[] arr = new int[]{2, 0, -2, 4, 2, 0, -4, 5, 7};
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_so_far = 0 ;
        int max_ending_here =0;
        int start=0,end=arr.length-1,s=0;

        for (int i = 0; i < arr.length ; i++) {
            max_ending_here = max_ending_here + arr[i];

            if(max_ending_here<0) {
                max_ending_here=0;
                s = i+1;
            }

            if(max_ending_here>max_so_far){
                max_so_far = max_ending_here;

                start=s;
                end=i;
            }

        }
    System.out.println(max_so_far);
        System.out.println(start);
        System.out.println(end);

    }

}
