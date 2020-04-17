
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 6, 64, 3, 3, 7, 0, 05, 35, 24, 63, 13};
        System.out.println("initial array : " + Arrays.toString(arr));
        quickSort(arr);
        System.out.println("Quick sorted array : " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        //pick middle element as pivot element
        int pivot = arr[mid];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {

        while (left <= right) {
            //increment left index till the element is less than pivot element
            while (arr[left] < pivot) {
                left++;
            }
            // decrement right index till elements are greater than pivot element
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                //swap will called when there is both indexes are stopped at one point.
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
