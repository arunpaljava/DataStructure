package payu;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String args[]) {
        int arr[] = {16,17,4,3,5,2};
        List<Integer> listOfLraders = getLeadersInAnArray(arr, arr.length);
        System.out.println(listOfLraders);
    }

    private static List<Integer> getLeadersInAnArray(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 1;
        while (i < n) {
            if (i == n - 1) {
                list.add(arr[i]);
                break;
            } else if (arr[i] >= arr[j]) {
                if (j == n - 1) {
                    list.add(arr[i++]);
                    j = i;
                }
                j++;
            } else {
                i = j;
                j++;
            }
        }
        return list;
    }
}
