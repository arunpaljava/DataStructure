package Array;
import java.util.stream.IntStream;

public class SubArrayWithGivenSum {

    public static void main(String s[]){
        int [] array = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        int target =468;
        Integer [] subArray = getSubArray(array,target);
        if(null !=subArray) {
            for (Integer val : subArray) {
                System.out.print(val+", ");
            }
        }
        }

    private static Integer[] getSubArray(int[] array, int target) {
        int currSum = 0;
        int start = 0;
        for(int i=0;i<array.length;i++){
           currSum+=array[i];
           while(currSum>target){
               currSum-=array[start];
               start++;

           }
           if(currSum==target) {
                return IntStream.range(start,i+1).mapToObj(index->array[index]).toArray(Integer[] ::new);
            }
        }
        return null;
    }


}
