
import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String args[]){

        int[] num = {0,1,0,1,2,0,1,2,1,0,2,2};
        int low,mid,high;
        low=0;
        high = num.length-1;
        mid = 0;
        int temp=0;
        while(mid<high) {
            switch (num[mid]){
                case 0:
                    temp = num[low];
                    num[low]=num[mid];
                    num[mid] =temp;
                     low++;
                     mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = num[mid];
                    num[mid]=num[high];
                    num[high] =temp;
                    high--;
                    break;
            }

        }
    System.out.println(Arrays.toString(num));
    }
}
