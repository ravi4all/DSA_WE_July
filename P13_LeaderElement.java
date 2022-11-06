package ArrayProblems;

public class P13_LeaderElement {
    public static void main(String[] args) {
        int arr[] = {12,34,35,16,14,17,5};
        int n = arr.length;
        int max = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > max) {
                System.out.println("Leader Element : " + arr[i]);
                max = arr[i];
            }
        }
    }
}
