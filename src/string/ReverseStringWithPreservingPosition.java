package string;
public class ReverseStringWithPreservingPosition {
    public static void main(String[] args) {

        String input = "I am not String";
        int n = input.length();
        // Initialize two pointers as two corners
        int start = 0;
        int end = n - 1;
        char[] str = input.toCharArray();
        // Move both pointers toward each other
        while (start < end) {
            // If character at start or end
            // is space, ignore it
            if (str[start] == ' ') {
                start++;
                continue;
            } else if (str[end] == ' ') {
                end--;
                continue;
            } else {
                // If both are not spaces, do swap
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(String.valueOf(str));
    }
}
