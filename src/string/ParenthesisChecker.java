package string;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String args []) {
        String str = "{([])}";
        System.out.println(ispar(str));
    }

    static boolean ispar(String x)
    {
        // add your code here {([])}
        Stack<Character> stack = new Stack<>();
        for(int i= 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if(!stack.isEmpty() && ch == ')') {
                if(stack.pop() != '('){
                    return false;
                }

            }else if(!stack.isEmpty() && ch == '}') {
                if(stack.pop() != '{'){
                    return false;
                }

            }else if(!stack.isEmpty() && ch == ']') {
                if(stack.pop() != '['){
                    return false;
                }

            } else {
                stack.push(ch);
            }

        }
        return true;
    }
}
