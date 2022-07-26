package string;

public class RemoveSpaceFromString {
    public static void main(String args){

    }


    private String reverse(String str){
        String ans = null;
        for(int i=0;i<str.length();i++){
            char ch =  str.charAt(i);
            if(ch== ' ') {
                continue;
            } else {
                ans+=Character.toString(ch);
            }

        }
        return ans;

    }
}
