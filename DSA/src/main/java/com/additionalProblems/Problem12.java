package com.additionalProblems;

/*
Q2. Subarray with least average
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of size N, find the subarray of size B with the least average.



Problem Constraints
1 <= B <= N <= 105
        -105 <= A[i] <= 105


Input Format
First argument contains an array A of integers of size N.
Second argument contains integer B.


        Output Format
Return the index of the first element of the subarray of size B that has least average.
Array indexing starts from 0.


Example Input
Input 1:
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
Input 2:

A = [3, 7, 5, 20, -10, 0, 12]
B = 2


Example Output
Output 1:
        3
Output 2:

        4


Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average
among all subarrays of size 3.
Explanation 2:

Subarray between [4, 5] has minimum average
*/


public class Problem12 {

    public int solve(int[] A, int B) {

        int l = 0;
        int r = B-1;
        int sum = 0;

        for(int i =0; i< B; i++){

            sum = sum + A[i];

        }
        int min_avg = sum;
        int min_index = l;


        l = l + 1;  // Window Shift
        r = r + 1;  // Window Shift

        while(l <= A.length - B){

            sum = sum + A[r] - A[l-1];

            if(sum < min_avg){
                min_avg = sum ;
                min_index = l;
            }

            l++;
            r++;
        }

        return min_index;


    }
}
