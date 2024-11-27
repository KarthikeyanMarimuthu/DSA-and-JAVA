package com.advanced.module1.additional;
/*

Q4. Sort 01
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of 0s and 1s of length N. Sort this array.

        Note - Do not use any sorting algorithm or library's sort method.



Problem Constraints
1 ≤ N ≤ 105

        0 ≤ A[i] ≤ 1



Input Format
First argument A is an array of length N.



        Output Format
Return the sorted array.



Example Input
Input 1:

A = [0,0,1,0,1,1,0]
Input 2:

A = [1,0]


Example Output
Output 1:

        [0,0,0,0,1,1,1]
Output 2:

        [0,1]

*/


public class Problem37 {

    public int[] sort01(int[] A) {

        int freq[] = new int[2];

        for (int i = 0; i < A.length; i++) {

            freq[A[i]] = freq[A[i]] + 1;

        }

        int k = 0;
        for (int i = 0; i < freq.length; i++) {

            if (freq[i] != 0) {

                for (int j = 0; j < freq[i]; j++) {

                    A[k] = i;
                    k++;
                }
            }
        }

        return A;
    }

}
