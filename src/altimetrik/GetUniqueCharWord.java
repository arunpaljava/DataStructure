package altimetrik;

import java.util.HashSet;
import java.util.Set;

public class GetUniqueCharWord {
    public static void main(String s[]) {
        String str = "Harry chases around grass mayur manish";
        //o/p: around mayur manish
        String strArr[] = str.split(" ");
        System.out.println(getUniqueCharWord(strArr));
    }

    private static String getUniqueCharWord(String[] str) {
        int flag = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < word.length(); j++) {
                flag = 0;
                char ch = word.charAt(j);
                if (!set.add(ch)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                ans.append(word);
                ans.append(",");
            }
        }
        return ans.toString();
    }
}
