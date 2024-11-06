package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Solution.maxSubarray(5,7,new int[]{3,8,8,9,7}));


    }

    static class Solution {
        public static int maxSubarray(int A, int B, int[] C) {
            // Brute force
            if(A==1 ){
                if(C[0]<=B)
                    return C[0];
                else
                    return 0;
            }
            int max = 0;
            for(int i = 0; i < A; i++){

                for(int j = i; j < A; j++){
                    int sum = 0;
                    for(int k = i; k <=j; k++){
                        sum = sum + C[k];
                    }
                    if(sum <= B ){
                        max = Math.max(sum, max);
                    }

                }
            }

            return max;

        }
    }

}
