package ArrayProblems;

import java.util.Arrays;

public class P6_PairSum {
    public int[] twoSum(int[] arr, int k) {
        int sum = 0;
        int outputArr[] = new int[2];
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                if(sum == k) {
                    outputArr[0] = i;
                    outputArr[1] = j;
                    return outputArr;
                }
            }
        }
        return null;
    }

    public void twoSumApproach_2(int arr[], int n, int k) {
        int i = 0;
        int j = n-1;
        Arrays.sort(arr);
        while(i < j) {
            if(arr[i] + arr[j] == k) {
                System.out.println(i + "," + j);
                return;
            }
            else if(arr[i] + arr[j] < k) {
                i++;
            }
            else {
                j--;
            }
        }
    }
}
