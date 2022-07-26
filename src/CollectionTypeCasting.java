import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

}

class Address extends Employee {
    private String city;
    private String country;

    public Address() {
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

public class CollectionTypeCasting {
    public static void main(String s[]) {
        List<Employee> employeeList = new ArrayList<>();
        Address address1 = new Address("Ghaziabad", "India");
        Address address2 = new Address("Meerut", "India");
        Address address3 = new Address("Delhi", "India");
        Address address4 = new Address("Mathura", "India");
        employeeList.add(address1);
        employeeList.add(address2);
        employeeList.add(address3);
        employeeList.add(address4);
        for (Employee obj : employeeList) {
            System.out.println("Id : " + obj.getId() + " Name : " + obj.getName());
            System.out.println("City : " + ((Address) obj).getCity() + " Country : " + ((Address) obj).getCountry());

        }
    }

}
