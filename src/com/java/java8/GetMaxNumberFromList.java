package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class GetMaxNumberFromList {
    public static void main(String args[]){

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        OptionalInt max = myList.stream().mapToInt(num->num).max();
        System.out.println(max.getAsInt());

        List<SortEmpListAccordingToSalary> list =new ArrayList<>();
        list.add(new SortEmpListAccordingToSalary(33000,"Arun","ABC"));
        list.add(new SortEmpListAccordingToSalary(35000,"kumar","sdfsd"));
        list.add(new SortEmpListAccordingToSalary(20000,"Pal","PQR"));
        list.add(new SortEmpListAccordingToSalary(24000,"Aarav","XYZ"));
        list.add(new SortEmpListAccordingToSalary(58000,"Sumit","TYU"));
        list.add(new SortEmpListAccordingToSalary(78000,"Test","RTY"));
        List<SortEmpListAccordingToSalary> empLis = list.stream().sorted(Comparator.comparing(SortEmpListAccordingToSalary :: getSalary)).collect(Collectors.toList());
        list.stream().sorted(Comparator.comparing(SortEmpListAccordingToSalary::getSalary).thenComparing(Comparator.comparing(SortEmpListAccordingToSalary::getName)));
        empLis = list.stream().sorted(Comparator.comparing(SortEmpListAccordingToSalary::getSalary).reversed().thenComparing(Comparator.comparing(SortEmpListAccordingToSalary::getName))).collect(Collectors.toList());
        for(SortEmpListAccordingToSalary emp : empLis){
            System.out.println(emp.getSalary());
        }

    }
}
