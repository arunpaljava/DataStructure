package payu;

public class GoodOrBadString {

    public static void main(String args[]) {
        System.out.println(isGoodorBad("aeioup???"));
    }

    static int isGoodorBad(String S) {
        // code here
        int v = 0, c = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '?') {
                v++;
                c++;
            }
            if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i'
                    || S.charAt(i) == 'o' || S.charAt(i) == 'u') {
                v++;
                c = 0;
            } else {
                c++;
                v = 0;
            }
            if (c > 3 || v > 5) {
                return 0;
            }
        }
        return 1;
    }
}
