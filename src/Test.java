
public class Test {
    public static void main(String srgs[]) {
        int a[] = {1, 4, 5, 6, 32, 50, 60, 70, 80, 90};
        int k = 63;
        int start = 0;
        int num = new Test().getNumber(a, k, start, a.length);
        System.out.println(num);
    }

    private int getNumber(int[] a, int k, int start, int end) {
        int ans = 0;
        int diff = Integer.MAX_VALUE;
        while (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] == k) {
                ans = a[mid];
                break;
            } else if (a[mid] > k) {
                end = mid;
                if (a[mid] - k < diff) {
                    diff = a[mid] - k;
                    ans = a[mid];
                }
            } else {
                start = mid;
                if (k - a[mid] < diff) {
                    diff = a[mid] - k;
                    ans = a[mid];
                }

            }
        }
        return ans;

    }
}
