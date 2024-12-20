package com.advanced.module1.assignments;

/*

Q1. Merge Two Sorted Arrays
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.

Note: A linear time complexity is expected and you should avoid use of any library function.


        Problem Constraints
-2×109 <= A[i], B[i] <= 2×109
        1 <= |A|, |B| <= 5×104


Input Format
First Argument is a 1-D array representing  A.
Second Argument is also a 1-D array representing B.


Output Format
Return a 1-D vector which you got after merging A and B.


Example Input
Input 1:

A = [4, 7, 9]
B = [2, 11, 19]
Input 2:

A = [1]
B = [2]


Example Output
Output 1:

        [2, 4, 7, 9, 11, 19]
Output 2:

        [1, 2]
*/



public class Problem38 {

    public int[] solve(final int[] A, final int[] B) {

        return merge(A, B);


    }

    public static int[] merge(int A[], int B[]){

        int res[] = new int[A.length + B.length];

        int a = 0, b =0, k =0;

        while(a < A.length && b < B.length){

            if(A[a] <= B[b]){

                res[k] = A[a];

                k++;
                a++;
            }

            else{
                res[k] = B[b];

                k++;
                b++;
            }

        }

        while( a < A.length){

            res[k] = A[a];

            k++;
            a++;
        }

        while( b < B.length){

            res[k] = B[b];

            k++;
            b++;
        }

        return res;
    }
}
