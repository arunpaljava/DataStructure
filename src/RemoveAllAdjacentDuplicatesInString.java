public class RemoveAllAdjacentDuplicatesInString {

    public static void main(String[] args) {

        String input = "abbbaca";
        String ans = getRemoveAllAdjacentDuplicatesInString(input);
        System.out.println("\n"+ans);

    }

    private static String getRemoveAllAdjacentDuplicatesInString(String input) {
        char [] stack = new char[input.length()];
        int top=0;

        for(int j=0;j<input.length();j++) {
            char currentChar = input.charAt(j);
            if(top > 0 && stack[top-1]== currentChar){
                top --;
            } else {
                stack[top]=currentChar;
                top++;
            }
        }
        return new String(stack,0,top);
    }
}
