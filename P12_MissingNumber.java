package ArrayProblems;

public class P12_MissingNumber {

    // static void approach_1(int arr[], int n) {
    //     int sum = 0;
    //     for(int i = 0; i < n; i++) {
    //         sum += arr[i];
    //     }
    //     int total = (n+1) * (n+2) / 2;
    //     int missing = total - sum;
    //     System.out.println("Missing Number is : " + missing);
    // }

    static void approach_2(int arr[], int n) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++) {
            x = x ^ arr[i];
        }
        for(int i = 0; i <= n; i++) {
            y = y ^ i;
        }
        int missing = x ^ y;
        System.out.println("Missing Number is : " + missing);
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = arr.length;
        // approach_1(arr, n);
        approach_2(arr, n);
    }
}
