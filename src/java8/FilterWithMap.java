package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWithMap {
    public  static void main(String s[]){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Gerhard", 90000),
                new Employee(2, "Peter", 100000),
                new Employee(3, "Andriya", 60000),
                new Employee(4, "Ashja", 80000)
        );

        List<String> newEmployees = employees.stream()
                .filter(e -> e.getSalary() > 80000)
                .map(e -> e.getName())
                .collect(Collectors.toList());

        System.out.println(newEmployees);
    }

    static class Employee {
        private int id;
        private String name;
        private int salary;

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

}
