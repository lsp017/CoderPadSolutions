
import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        String str = "{[]}[()]";
        char[] c = str.toCharArray();
        boolean imBalanceVar = false;
        for (char ch : c) {
            if (map.containsKey(ch)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != map.get(ch)) {
                    imBalanceVar = true;
                    break;
                }
            } else {
                stack.push(ch);
            }
        }
        if (stack.isEmpty() && !imBalanceVar) System.out.println("balanced");
        else System.out.println("Imbalanced");
    }
}
