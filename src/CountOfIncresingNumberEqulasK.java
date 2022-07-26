public class CountOfIncresingNumberEqulasK {

    public static void main(String s[]){
        Integer [] arr = new Integer[] {5,3,5,6,7,2,9};
        int k=3;
        int count = getCountOfIncresingNumberEqulasK(arr,k);
        System.out.println("Count = "+count);
    }

    private static int getCountOfIncresingNumberEqulasK(Integer[] arr, int k) {
        int ans = 0;
        int count = 0;
        int i=0;
        for(int j=0; j<arr.length-1;){
            if(arr[j] < arr[j+1]) {
                count++;
                if(count== k-1){
                    ans++;
                    i++;
                    j=i;
                    count=0;
                } else {
                    j++;
                }

            } else {
                i++;
                j++;
                count=0;
            }
        }
        return ans;
    }
}
