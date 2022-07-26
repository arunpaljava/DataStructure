package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpListAccordingToSalary {
    private int salary;
    private String name;
    private String compancy;

    public SortEmpListAccordingToSalary(int salary, String name,String compancy){
        this.salary=salary;
        this.name=name;
        this.compancy=compancy;

    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getCompancy() {
        return compancy;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompancy(String compancy) {
        this.compancy = compancy;
    }


}
