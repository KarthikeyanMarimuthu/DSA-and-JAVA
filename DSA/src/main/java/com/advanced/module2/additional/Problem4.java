package com.advanced.module2.additional;

/*

Q1. Matrix Median
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given a matrix of integers A of size N x M in which each row is sorted.

Find and return the overall median of matrix A.

NOTE: No extra memory is allowed.

        NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.



        Problem Constraints
1 <= N, M <= 10^5

        1 <= N*M <= 10^6

        1 <= A[i] <= 10^9

N*M is odd



Input Format
The first and only argument given is the integer matrix A.



        Output Format
Return the overall median of matrix A.



        Example Input
Input 1:

A = [   [1, 3, 5],
        [2, 6, 9],
        [3, 6, 9]   ]
Input 2:

A = [   [5, 17, 100]    ]


Example Output
Output 1:

        5
Output 2:

        17


Example Explanation
Explanation 1:

A = [1, 2, 3, 3, 5, 6, 6, 9, 9]
Median is 5. So, we return 5.
Explanation 2:

Median is 17.

*/

public class Problem4 {

    public int findMedian(int[][] A) {

        int n = A.length;
        int m = A[0].length;

        int l = 1;
        int r = Integer.MIN_VALUE;

        for(int arr[] : A ){

            l = Math.min(l, arr[0]);
            r = Math.max(r, arr[m-1]);
        }

        while(l <= r){

            int mid = l +(r- l)/2;

            int count = 0;

            for(int arr[]: A){

                count = count + countLessThan(arr, mid);
            }


            if(count <= (n*m)/2){

                l = mid + 1;
            }

            else{
                r = mid -1;
            }


        }

        return l;
    }

    public static int countLessThan(int[] arr, int target){

        int l = 0;
        int r = arr.length -1;

        while(l <= r){

            int mid = l + (r - l) / 2;

            if(arr[mid] <= target){

                l = mid +1;
            }

            else{
                r = mid - 1;
            }
        }

        return l;
    }


}
