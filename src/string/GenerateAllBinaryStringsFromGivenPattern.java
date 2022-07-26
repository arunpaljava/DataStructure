package string;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryStringsFromGivenPattern {
    static List<String> res = new ArrayList<>();
    public static void main(String args []){
        String str = "1??0?101";
        genAllPossibleCombinqation(str);
        System.out.println(res);
    }

    private static void genAllPossibleCombinqation(String str) {
        if(str.indexOf("?")!= -1){
            String str1 = str.replaceFirst("\\?","0");
            String str2 = str.replaceFirst("\\?","1");
            genAllPossibleCombinqation(str1);
            genAllPossibleCombinqation(str2);
        }else {
            res.add(str);
        }
    }
}
