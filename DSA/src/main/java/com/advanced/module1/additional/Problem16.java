package com.advanced.module1.additional;

/*

Q2. Max of an Array Using Recursion
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of size N, write a recursive function that returns the maximum element of the array.


Problem Constraints
1 <= N <= 100
        1 <= A[i] <= 1000


Input Format
The first line contains the array A.


        Output Format
A single integer is the maximum value of the array.


Example Input
Input 1:
A = [12, 10, 3, 4, 5]
Input 2:
A = [1, 5, 80, 40]


Example Output
Output 1:

        12
Output 2:
        80


Example Explanation
Explanation 1:
The Maximum element of the array A, [12, 10, 3, 4, 5] is 12
Explanation 2:
The Maximum element of the array A, [1, 5, 80, 40] is 80

*/


public class Problem16 {

    public int getMax(int[] A) {

        return max(A, Integer.MIN_VALUE, 0);
    }


    public static int max(int [] A, int max, int i){

        if(i >= A.length){

            return max;
        }

        if( A[i] > max){

            max = A[i];
        }

        return max(A, max, i+1);
    }
}
