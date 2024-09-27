package com.assignments;


/*Q2. Closest MinMax
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output
Output 1:

        2
Output 2:

        3*/

public class Problem10 {

    public int solve(int[] A) {


        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;

        for(int i =0 ; i< A.length; i++){

            if(A[i] > max_value){
                max_value = A[i];
            }

            if(A[i] < min_value){
                min_value = A[i];
            }
        }

        int min_ptr = -1;
        int max_ptr = -1;
        int size = Integer.MAX_VALUE;

        for(int i = 0; i< A.length; i++){


            if(A[i]==max_value){
                max_ptr = i;
            }

            if(A[i]==min_value){
                min_ptr = i;
            }

            if(min_ptr!=-1 && max_ptr!=-1){
                                                       //Adding 1 bcoz of Array range
                size = Math.min(size,  Math.abs(min_ptr - max_ptr) +  1);

            }

            if(size==2){
                break;
            }
        }

        return size;
    }
}
