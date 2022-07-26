package string;

import java.util.Arrays;

class LongestCommonPrefix {

    public static void main(String args[]) {
        String str[] = new String[]{"dog", "doecar", "dogcar"};
        System.out.println(findlongestCommonPrefix(str));
    }

    public static String findlongestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size == 0) {
            return "";
        } else if (size == 1) {
            return strs[0];
        }

        //Sort the array
        Arrays.sort(strs);

        //find the minimum length from first and last string
        int end = Math.min(strs[0].length(), strs[size - 1].length());

        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size - 1].charAt(i)) {
            i++;
        }
        String pre = strs[0].substring(0, i);
        return pre;

    }
}