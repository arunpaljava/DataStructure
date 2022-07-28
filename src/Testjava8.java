import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Testjava8 {

    class Employee{
        int id;
        String depart;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDepart() {
            return depart;
        }

        public void setDepart(String depart) {
            this.depart = depart;
        }
    }
    public static void main(String args []){
        List<Employee> list = new ArrayList<>();
        //list.stream().map(emp - >emp.getId).collector(Collectors.GroupBy(emp::getDepartment(),id))
       // list.stream().map(emp ->emp).collect(Collectors.groupingBy(emp::getDepart),
    }
}
