package ArrayProblems;

public class P3_SecondMax {

    // TC : O(n)
    static void approach_1(int arr[], int n) {
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Element is : " + max);

        int secondMax = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second Max Element is : " + secondMax);
    }

    static void approach_2(int arr[], int n) {
        int max = -1;
        int secondMax = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Max Element is : " + max);
        System.out.println("Second Max Element is : " + secondMax);
    }


    public static void main(String[] args) {
        int arr[] = {3,4,2,5,7,12,6,18};
        int n = arr.length;
        approach_1(arr, n);
        approach_2(arr, n);
    }
}
