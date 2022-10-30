package ArrayProblems;

public class P5_ReverseAnArray {

    static void reverse(int arr[], int n) {
        int i = 0;
        int j = n-1;
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
        int arr[] = {3,2,5,6,1,5,7};
        int n = arr.length;
        reverse(arr, n);
    }
}
