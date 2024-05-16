public class DEMOOO {


    static int secondSmallest(int[] arr,int n) {

        int s = arr[0];
        int ss = -1;
        for (int i = 1; i < n; i++) {

                if(arr[i] < s) {
                    ss = s;
                    s = arr[i];
                } else if(s != ss && ss > arr[i]) {
                    ss = arr[i];
                }

        }
        return ss;
    }
    static int secondLargestEle(int[] arr,int n) {

        int l = arr[0];
        int sl = -1;

        for (int i = 1; i < n; i++) {

            if(arr[i] > l) {
                sl = l;
                l = arr[i];
            }else if(l != sl && sl < arr[i]) {
                sl = arr[i];
            }

        }
        return sl;
    }
    static int findMinimumELe(int[] arr,int n) {

        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    static int findLargestEle(int[] arr,int n) {

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {3,12,54,33};
        int n = arr.length;
        int result =  secondSmallest(arr,n);
        System.out.println(result);
    }
}
