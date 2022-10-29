package ArrayProblems;

import java.util.Arrays;

public class P2_MaxElement {

    // TC : O(n^2)
    static void approach_1(int arr[], int n) {
        boolean isMax;
        for(int i = 0; i < n; i++) {
            isMax = true;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax) {
                System.out.println("Max Element is : " + arr[i]);
                return;
            }
        }
    }

    // TC : O(n)
    static void approach_2(int arr[], int n) {
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Element is : " + max);
    }

    static void approach_3(int[] arr, int n) {
        // Java Uses Tim Sort
        Arrays.sort(arr);
        int max = arr[n-1];
        System.out.println("Max Element is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = {4,3,6,7,9,12,4,3};
        int n = arr.length;
    }
}
