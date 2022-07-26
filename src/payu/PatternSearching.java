package payu;

public class PatternSearching {

    public static void main(String args []){
        int pat = search("ilbmywtxyu","yu");
        System.out.println(pat);
    }


    static int search(String text, String pat) {
        // code here
        if(text.length()<pat.length()){
            return 0;
        }
        int p=pat.length();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==pat.charAt(0) && (i+p)<=text.length() && pat.equals(text.substring(i,i+p))){
                return 1;
            }
        }
        return 0;
    }
}
