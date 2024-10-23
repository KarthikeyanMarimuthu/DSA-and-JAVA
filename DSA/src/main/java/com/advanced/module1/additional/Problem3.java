package com.advanced.module1.additional;

/*
Q1. Minimum Swaps
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.



Problem Constraints

1 <= length of the array <= 100000
        -109 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return the minimum number of swaps.



Example Input

Input 1:

A = [1, 12, 10, 3, 14, 10, 5]
B = 8
Input 2:

A = [5, 17, 100, 11]
B = 20


Example Output

Output 1:

        2
Output 2:

        1


Example Explanation

Explanation 1:

A = [1, 12, 10, 3, 14, 10, 5]
After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
Now, all elements less than or equal to 8 are together.
Explanation 2:

A = [5, 17, 100, 11]
After swapping 100 and 11, A => [5, 17, 11, 100].
Now, all elements less than or equal to 20 are together.
*/


public class Problem3 {


    public int solve(int[] A, int B) {


        // Sliding window and check how many swaps are required in the window

        // find minimum swaps among all the window

        //find how many numbers are lesser than equal to B

        int size = 0;

        for(int i = 0; i < A.length; i++){

            if(A[i]<= B){

                size++;
            }
        }

        // first window

        int l = 0;
        int r = size - 1;


        int bad_nums = 0;
        for(int i = 0; i < size; i++){

            if(A[i] > B){

                bad_nums++;
            }
        }

        int min_value =bad_nums;

        l = l+1;
        r = r+1;

        while(l <=A.length - size){

            if(A[l-1] > B){

                bad_nums--;
            }

            if(A[r] > B){

                bad_nums++;
            }


            min_value = Math.min(bad_nums, min_value);

            l++;
            r++;
        }


        return min_value;

    }


}
