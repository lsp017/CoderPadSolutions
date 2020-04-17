
import java.util.Arrays;
import java.util.List;

public class SumofTriplets {

    public static void main(String[] args) {
        int[] arr = {0, 2, 7, 4, 9, 5, 1, 3, 10, 15};
        int left;
        int right;
        int sum = 22;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            left = i + 1;
            right = left + 1;
            while (right < arr.length) {
//                System.out.println(left +" " + right);
//                if(right==arr.length-2){
//                    left++;
//                    right=left+1;
//                }
                int a = arr[i];
                int totalSUm = a + arr[left] + arr[right];
                if (totalSUm <= sum) {
                    System.out.println("[" + a + "," + arr[left] + "," + arr[right] + "]");
                    right++;
                } else {
                    left = left + 1;
                    right = left + 1;
                }

            }
        }
    }
}
