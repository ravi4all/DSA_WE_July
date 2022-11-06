package ArrayProblems;

public class P10_OddElement {

    // Approach-1 : Hashing
    static void approach_1(int arr[], int n) {
        int hash[] = new int[100];
        for(int i = 0; i < n; i++) {
            hash[arr[i]] = ++hash[arr[i]];
        }
        for(int i = 0; i < hash.length; i++) {
            if(hash[i] == 1) {
                System.out.println("Element is : " + i);
                break;
            }
        }
    }

    // Approach-2 : XOR
    static void approach_2(int arr[], int n) {
        int output = 0;
        for(int i = 0; i < n; i++) {
            output = output ^ arr[i];
        }
        System.out.println("Element is : " + output);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;
        // approach_1(arr, n);
        approach_2(arr, n);
    }
}
