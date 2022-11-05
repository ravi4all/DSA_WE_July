package ArrayProblems;

public class P7_RotateArrayOnce {

    static void approach_1(int arr[], int n) {
        // Storing last element of array in a variable
        int x = arr[n-1];
        for(int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }

    // Using 2 pointer approach
    static void approach_2(int arr[], int n) {
        // Storing last element of array in a variable
        int i = 0;
        int j = n-1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        
    }
}
