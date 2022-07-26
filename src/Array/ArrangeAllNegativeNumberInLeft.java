package Array;
public class ArrangeAllNegativeNumberInLeft {
    public static void main(String s[]) {
        int[] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int j=0;
        int temp;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                if(i!=j){
                    temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
                j++;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
