package com.advanced.module1.assignments;

/*
Q1. Max Sum Contiguous Subarray
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.



        Problem Constraints
1 <= N <= 1e6
        -1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

A = [1, 2, 3, 4, -10]
Input 2:

A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


Example Output
Output 1:

        10
Output 2:

        6


Example Explanation
Explanation 1:

The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:

The subarray [4,-1,2,1] has the maximum possible sum of 6.
*/



public class Problem1 {

    public int maxSubArray(final int[] A) {

        //Kadane's ALgorithm , if the Array has both positive and negative numbers.

        int run_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i< A.length; i++){

            run_sum = run_sum + A[i];

            if(run_sum > max_sum){

                max_sum = run_sum;
            }

            if(run_sum < 0){

                run_sum = 0;
            }
        }

        return max_sum;



        // Min Sum

        // int run_sum = 0;
        // int min_sum = Integer.MAX_VALUE;

        // for(int i =0; i< A.length; i++){

        //     run_sum = run_sum + A[i];

        //     if(run_sum < min_sum){
        //         min_sum = run_sum;
        //     }

        //     if( run_sum > 0){
        //         run_sum = 0;
        //     }
        // }

    }



}
