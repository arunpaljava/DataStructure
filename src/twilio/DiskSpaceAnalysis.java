package twilio;

import java.util.Arrays;
import java.util.List;

public class DiskSpaceAnalysis {
    public static void main(String[] args) {
        int x=2;
        List<Integer> list = Arrays.asList(new Integer[] {8,2,4,6});
        System.out.println(segement(x,list));
    }
    public static int segement(int x, List<Integer> space) {
        // Write your code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=space.size()-x;i++) {
            min=Integer.MAX_VALUE;
            for(int j=i;j<(i+x);j++) {
                min=Math.min(min,space.get(j));
            }
            max=Math.max(min,max);
        }
        return max;
    }
}
