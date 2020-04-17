import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 6, 64, 3, 3, 7, 0, 05, 35, 24, 63, 13};
        System.out.println("initial array : " + Arrays.toString(arr));
        mergeArrays(arr);
        System.out.println("sorted array : " + Arrays.toString(arr));

    }

    public static void mergeArrays(int arr[]) {
        int len = arr.length;
        int[] temp = new int[len];
        // temp is used as auxiliary array to store the sorted values
        mergeArrays(arr, temp, 0, len - 1);
    }

    public static void mergeArrays(int arr[], int[] temp, int leftIndArr, int rightIndArr) {
        if (leftIndArr >= rightIndArr) {
            return;
        }
        int mid = (leftIndArr + rightIndArr) / 2;
        mergeArrays(arr, temp, leftIndArr, mid);
        mergeArrays(arr, temp, mid + 1, rightIndArr);
        //merge two halves
        mergeHalves(arr, temp, leftIndArr, rightIndArr);
    }

    public static void mergeHalves(int arr[], int[] temp, int leftIndArr, int rightIndArr) {
        int leftend = (leftIndArr + rightIndArr) / 2;
        int rightstart = leftend + 1;
        int size = (rightIndArr - leftIndArr) + 1;

        int left = leftIndArr;
        int right = rightstart;
        int index = leftIndArr;

        while (left <= leftend && right <= rightIndArr) {
            if (arr[left] < arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        while(left<=leftend) {
            temp[index] = arr[left];
            left++;
            index++;
        }
        while(right<=rightIndArr) {
            temp[index] = arr[right];
            right++;
            index++;
        }


        //one among these will be called since the remaining elements in it are sorted
//        System.arraycopy(arr, left, temp, index, leftend - left + 1);
//        System.arraycopy(arr, right, temp, index, rightIndArr - right + 1);



        //All the sorted temp elements will be copied to main array
        System.arraycopy(temp, leftIndArr, arr, leftIndArr, size);
    }

}
