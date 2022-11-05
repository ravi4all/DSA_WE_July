package ArrayProblems;

public class P8_RotateArrayByK {
    // static void approach_1(int arr[], int n, int k) {
    //     for(int j = 1; j <= k; j++) {
    //         int x = arr[n-1];
    //         for(int i = n-1; i > 0; i--) {
    //             arr[i] = arr[i-1];
    //         }
    //         arr[0] = x;
    //     }
    //     for(int i : arr) {
    //         System.out.print(i + ",");
    //     }
    // }

    // static void approach_2(int arr[], int n, int k) {
    //     // Space Complexity : O(n)
    //     int temp[] = new int[n];

    //     for(int i = 0; i < n; i++) {
    //         temp[(i + k) % n] = arr[i];
    //     }

    //     for(int i : temp) {
    //         System.out.print(i + ",");
    //     }
    // }

    static void reverse(int arr[], int i, int j) {
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7};
        // o/p : [5,6,7,1,2,3,4]
        int n = nums.length;
        int k = 3;
        // approach_1(nums, n, k);
        // approach_2(nums, n, k);

        // reverse(nums, 0, n-k-1);
        // reverse(nums, n-k, n-1);
        // reverse(nums, 0, n-1);

        // Will handle negative cases
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}
