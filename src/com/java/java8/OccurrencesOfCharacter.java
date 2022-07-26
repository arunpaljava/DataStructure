package com.java.java8;

import com.sun.org.apache.xpath.internal.operations.String;

public class OccurrencesOfCharacter {

    public static void main(String s[]){

        java.lang.String str = "ChennaiColomboChicago";
        long count = str.chars().filter(ch -> ch=='C').count();
        System.out.println(count);

    }
}
