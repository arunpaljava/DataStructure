import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IndexValueAdditionGetTargetNumber {

    public static void main(String s[]){
        int [] array = {3,7,3,15,3};
        int[] indexes = getAdditionofTwoIndexValue(array,22);
        for (int i : indexes) {
            System.out.print(i);
            System.out.print(",");
        }
    }

    private static int [] getAdditionofTwoIndexValue(int [] arr, int target){
        Map<Integer,Integer> intMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            intMap.put(arr[i],i);
        }
        intMap.forEach((key,value)->System.out.println(key+"----"+value));
      //  Map<Integer,Integer> intMap = Arrays.stream(arr).boxed().collect(Collectors.toMap(i->arr[i],i->i));

        for(int i=0;i<arr.length;i++){
            int num = target-arr[i];
            if(intMap.containsKey(num) && intMap.get(num) !=i){
                return new int[] {i,intMap.get(num)};
            }
        }
        return new int[] {-1,-1};
    }

}
