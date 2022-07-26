public class FindStringAfterNRotation {

    public static void main(String src[]){

        String s = "ArunJAvaDev123ABC";
        //runJAvaDev123ABCA -> 1st cyclic shift
        //unJAvaDev123ABCAr -> 2nd cyclic shift
        //nJAvaDev123ABCAru ->3rd cyclic shift
        //JAvaDev123ABCArun ->4rd cyclic shift
        //resultant string after 99999909 shifts
        int lenthOfString = s.length();
        int remaingRotation= 99999909%lenthOfString;
        System.out.println(remaingRotation);
        String shiftRotation = s.substring(0,remaingRotation);//Arun  1
        String str = s.substring(remaingRotation,s.length());
        String ans = str+shiftRotation; //JAvaDev123ABCArun 1
        System.out.println(ans);

    }
}
