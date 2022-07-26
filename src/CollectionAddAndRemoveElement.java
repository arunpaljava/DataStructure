import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionAddAndRemoveElement {

    public  static void main(String s[]){
        List<Long> linkedList = new LinkedList<>();
        linkedList.add(1L);
        linkedList.add(2L);
        linkedList.add(3L);
        linkedList.add(4L);
        List<Long> elementList = getElements(linkedList);
        for (Long num :elementList) {
            System.out.println(num);
        }
    }

    private static List<Long> getElements(List<Long> linkedList) {
        Iterator itr = linkedList.iterator();
        while(itr.hasNext()) {
            Long num = (Long) itr.next();
            if(num<3L){
                itr.remove();
                linkedList.remove(num);
            }
        }
        return linkedList;
    }
}
