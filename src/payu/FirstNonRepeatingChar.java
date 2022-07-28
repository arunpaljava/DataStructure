package payu;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
    public static void main(String args[]) {
        System.out.println(firstNonRepeating("aabc"));
    }

    public static String firstNonRepeating(String A) {
        // code here
        int hm[] = new int[26];
        String ans = "";
        Queue<Character> q = new LinkedList<>();

        for (char ch : A.toCharArray()) {
            hm[ch - 'a']++;
            q.add(ch);
            while (!q.isEmpty() && hm[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                ans = ans + "#";
            } else {
                ans += q.peek();
            }
        }
        return ans;
    }
}
