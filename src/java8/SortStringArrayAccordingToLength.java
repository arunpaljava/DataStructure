package java8;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayAccordingToLength {
    public static void main(String s[]){

        String str [] = new String[]{"Chennai","Pune","Mumbai","Hyderabad"};

        Arrays.sort(str, Comparator.comparing(String::length));
        for(String ss : str) {
            System.out.println(ss);
        }
    }
}
