package Array;

public class Segregate0sAnd1sInAnArray {
    public static void main(String args[]) {
        int arr[] = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 0, 0};
        //Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
        int ans[] = segregate0sAnd1sInAnArray(arr);
        for (int val : ans) {
            System.out.print(val + ",");
        }

    }

    private static int[] segregate0sAnd1sInAnArray(int[] arr) {
        //First approch
        /*int j= 0 ;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 1) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }*/
        //Seond Approch
        int left = 0;
        int right = arr.length - 1;
        while (arr[left] == 0) {
            left++;
        }
        while (arr[right] == 1) {
            right--;
        }
        while (left < right) {
            arr[left] = 0;
            arr[right] = 1;
            left++;
            right--;
        }
        return arr;
    }
}
