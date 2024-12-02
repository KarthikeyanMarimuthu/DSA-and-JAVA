package com.advanced.module2.assignments;

/*

Q3. Median of two sorted arrays
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given two sorted arrays A and B of size M and N respectively, return the median of the two sorted arrays.
Round of the value to the floor integer [2.6=2, 2.2=2]


Problem Constraints
0 <= M <= 105
        0 <= N <= 105
        -109 <= A[i], B[i] <= 109


Input Format
First argument A is an array of integers.
First argument B is an array of integers.


Output Format
Return an integer.


        Example Input
Input 1:

A = [1, 3]
B = [2]

Input 2:

A = [1, 2]
B = [3,4]


Example Output
Output 1:


        3


Output 2:


        3


Example Explanation
Example 1:


merged array = [1,2,3] and median is 2.
Example 2:


merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2
*/



public class Problem7 {

    public int solve(int[] A, int[] B) {

        // Always make A as smaller length bcoz to reduce iteration
        if(A.length > B.length){

            int temp[] = A;
            A = B;
            B = temp;
        }

        int N = A.length;
        int M = B.length;


        //int first_half = Math.min((N + M + 1) / 2, N);

        int first_half =(N + M + 1) / 2;
        int l = 0;
        int r = N;

        while(l <= r){

            int mid = (l + r) / 2;

            // int l1 = Integer.MIN_VALUE;
            // if(mid!=0){
            //     l1 = A[mid-1];
            // }
            // int r1 = A[mid];

            int B_point = first_half - mid;

            int l1 = (mid > 0) ? A[mid-1] : Integer.MIN_VALUE;
            int l2 = (B_point > 0 ) ? B[B_point -1] : Integer.MIN_VALUE;

            int r1 = (mid < N ) ? A[mid] : Integer.MAX_VALUE;
            int r2 = (B_point < M ) ? B[B_point] : Integer.MAX_VALUE;


            //int l2 = Integer.MIN_VALUE;
            // if(B_point!=0){

            //     l2 = B[B_point -1];

            // }

            // int r2 = B[B_point];


            if(l2 > r1){

                l = mid + 1;
            }

            else if(l1 > r2){

                r = mid - 1;
            }

            else{

                if((N+M) % 2==0){
                    int left = Math.max(l1,l2);
                    int right = Math.min(r1, r2);

                    return (left+right)/2;

                }

                else{

                    int median = Math.max(l1,l2);

                    return median;
                }


            }


        }

        return -1;


    }
}
