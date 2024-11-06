package com.advanced.module1.assignments;

/*
Q2. Single Number III
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.


        Problem Constraints
2 <= |A| <= 100000
        1 <= A[i] <= 109



Input Format
The first argument is an array of integers of size N.



        Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
        [3, 4]
Output 2:

        [1, 2]


Example Explanation
Explanation 1:
        3 and 4 appear only once.
        Explanation 2:

        1 and 2 appear only once.

*/


import java.util.Arrays;

public class Problem16 {

    public int[] solve(int[] A) {

        int xor_value = A[0];

        for(int i =1 ; i< A.length; i++){

            xor_value = xor_value ^ A[i];
        }

        int pos = 0;
        for(int i =0 ; i < 32 ; i++){

            if((xor_value & (1 << i)) > 0){

                pos = i;
                break;
            }
        }

        int res[] = new int[2];

        for(int i =0; i< A.length; i++){

            if((A[i] & (1 << pos)) > 0){

                res[0] = res[0] ^ A[i];
            }

            else{
                res[1] = res[1] ^ A[i];
            }
        }

        Arrays.sort(res);

        return res;

    }


}
