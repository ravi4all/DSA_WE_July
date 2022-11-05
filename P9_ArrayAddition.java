package ArrayProblems;

public class P9_ArrayAddition {
    public static void main(String[] args) {
        int arr_1[] = {9,1,8,9,2};
        int arr_2[] =   {9,1,2,7};
        int n1 = arr_1.length;
        int n2 = arr_2.length;
        int n3 = n1 > n2 ? n1 : n2;
        int arr_3[] = new int[n3];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3 - 1;
        int carry = 0;
        int sum = 0;

        while(k >= 0) {
            if(i >= 0 && j >= 0) {
                sum = arr_1[i] + arr_2[j] + carry;
            }
            else if(i >= 0 && j < 0) {
                sum = arr_1[i] + carry;
            }
            else if(i < 0 && j >= 0) {
                sum = arr_2[j] + carry;
            }

            carry = sum / 10;
            sum = sum % 10;
            arr_3[k] = sum;

            i--;
            j--;
            k--;
        }
        if(carry != 0) {
            System.out.print(carry);
        }
    }
}
