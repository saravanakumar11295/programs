package com.ios;

public class Sample4 {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, 3};
        System.out.println(getSumOfSubarrays(arr));
    }

    private static int getSumOfSubarrays(int[] arr) {
        int result = 0;
        int sum = 0;

        final int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                sum =0;
                for (int k = i ; k <= j; k++) {
                    sum += arr[k];
                }
                if (result < sum) 
                {
                    result = sum;
                }
            }

        }

        return result;
    }
}
