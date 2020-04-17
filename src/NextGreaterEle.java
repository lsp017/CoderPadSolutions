
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEle {
    public static void main(String[] args){
        int arr[] =     {5,15,10,8,6,12,9,18};
        int arr1[] = new int[arr.length];
        int arr2[] =arr;
        nextGreaterElement(arr);

        Stack<Integer> st = new Stack<>();
    //push the initial element to stack
         st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
    // if arr[i] is greater than top element of stack. Then the next greater element of the top element of stack is arr[i]
            if(arr[i] > st.peek()){
                // empty the stack until the top element is less than arr[i]
                while (!st.isEmpty() && st.peek()<arr[i]){
                    System.out.println(st.pop() + "'s greater element is " + arr[i]);

                }
                // once stack is empty push the arr[i] to stack
                st.push(arr[i]);
            }
            else
            {
                // push the element to stack if top element is less than arr[i]
                st.push(arr[i]);
            }
        }

        // This case is handled to print if there are no next greater elements for the current element in a stack
        if(!st.isEmpty()){
            while (!st.isEmpty()){
                System.out.println(st.pop() + " " + -1);
            }
        }
    }

    private static void nextGreaterElement(int[] arr) {
            Stack<Integer> st = new Stack<>();
            int[] arr2 = new int[arr.length];
            for(int i=arr.length-1;i>=0;i--){

                while (!st.isEmpty() && st.peek()<arr[i])
                    st.pop();
                if(st.isEmpty())
                    arr2[i]=-1;
                else
                    arr2[i]= st.peek();

                st.push(arr[i]);
            }
            System.out.println(Arrays.toString(arr2));

    }
}
