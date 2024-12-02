package com.advanced.module2.additional;
/*

Q1. Matrix Search
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in matrix A.

This matrix A has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
        Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom, and columns are from left to right.



        Problem Constraints
1 <= N, M <= 1000
        1 <= A[i][j], B <= 106



Input Format
The first argument given is the integer matrix A.
The second argument given is the integer B.



Output Format
Return 1 if B is present in A else, return 0.



Example Input
Input 1:

A = [
        [1,   3,  5,  7]
        [10, 11, 16, 20]
        [23, 30, 34, 50]
        ]
B = 3
Input 2:

A = [
        [5, 17, 100, 111]
        [119, 120, 127, 131]
        ]
B = 3


Example Output
Output 1:

        1
Output 2:

        0


Example Explanation
Explanation 1:

        3 is present in the matrix at A[0][1] position so return 1.
Explanation 2:

        3 is not present in the matrix so return 0.
*/

public class Problem1 {

    public int searchMatrix(int[][] A, int B) {

        int M = A.length;
        int N = A[0].length;

        int l = 0;
        int r = (M * N) - 1;

        while(l <= r){

            int mid = (l + r) / 2;

            int i =  mid / N; // By column we need to do
            int j =  mid % N; // By Column We need to do

            if(A[i][j] == B){

                return 1;
            }

            else if( A[i][j] > B){

                r = mid -1;
            }
            else{

                l = mid + 1;
            }
        }

        return 0;
    }
}
