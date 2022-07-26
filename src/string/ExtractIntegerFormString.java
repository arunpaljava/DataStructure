package string;

import java.util.stream.Stream;

public class ExtractIntegerFormString {

    public static void main(String s[]){

        String str= "Chennai400Mumbai200Pune";
        System.out.println("Original String "+str);
        str= str.replaceAll("[^\\d]"," ");
        System.out.println("replace non char to space String "+str);
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll(" +", " ");
        System.out.println("-----------"+str);
    }
}
