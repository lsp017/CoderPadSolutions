import java.util.Stack;

public class MinElementFromStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {

//        int[] arr = {9,4,6,5,10,11};
        int[] arr = {23, 2, 25, 28, 9, 22, 19, 16, 29, 32, 40};
        int lastEle = arr.length - 1;
        s1.push(arr[lastEle]);
        s2.push(arr[lastEle]);
        for (int i = lastEle - 1; i >= 0; i--) {
            s1.push(arr[i]);
            if (arr[i] < s2.peek()) s2.push(arr[i]);
        }
        popMin();
        popMin();
        popMin();
        popMin();
        popMin();
    }

    public static void popMin() {
        int ele = s1.pop();
        if (ele == s2.peek()) s2.pop();
        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("stack Empty");
            return;
        }
        System.out.println("Current Stack is :" + s1.toString());
        System.out.println("min ele is: " + s2.peek());
    }
}
