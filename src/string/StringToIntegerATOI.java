package string;

public class StringToIntegerATOI {
    public static void main(String args []) {
        System.out.println(new StringToIntegerATOI().myAtoi("-91283472332"));
    }

    public int myAtoi(String s) {
        if (null == s || s.isEmpty()) {
            return 0;
        }
        int i = 0;
        int len = s.length();
        int sign = 1;
        while (i < len && s.charAt(i) == ' ') {
            i++;
        }
        if (i == len) {
            return 0;
        }
        if (s.charAt(i) == '-') {
            sign = 0;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        long out = 0;
        while (i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            out = out * 10;
            if (out <= Integer.MIN_VALUE || out >= Integer.MAX_VALUE) {
                break;
            }
            out = out + (s.charAt(i) - '0');
            i++;
        }
        if (sign == 0)
            out = -1 * out;
        if (out >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (out <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int) out;

    }
}
