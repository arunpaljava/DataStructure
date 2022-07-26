package payu;

import java.util.Arrays;
import java.util.Stack;

public class ReverseEachWordInString {
    public static void main(String args[]) {
        System.out.println(reverseWords("i.like.this.program.very.much"));

    }

    static String reverseWords(String s) {
        // your code here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                sb.append('.');
            } else {
                st.push(s.charAt(i));
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }
}
