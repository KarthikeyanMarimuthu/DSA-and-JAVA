package com.advanced.module2.additional;

/*
Q2. ADD OR NOT
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of integers A of size N and an integer B.

In a single operation, any one element of the array can be increased by 1. You are allowed to do at most B such operations.

Find the number with the maximum number of occurrences and return an array C of size 2, where C[0] is the number of occurrences, and C[1] is the number with maximum occurrence.
If there are several such numbers, your task is to find the minimum one.



        Problem Constraints
1 <= N <= 105

        -109 <= A[i] <= 109

        0 <= B <= 109



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return an array C of size 2, where C[0] is number of occurence and C[1] is the number with maximum occurence.



Example Input
Input 1:

A = [3, 1, 2, 2, 1]
B = 3
Input 2:

A = [5, 5, 5]
B = 3


Example Output
Output 1:

        [4, 2]
Output 2:

        [3, 5]


Example Explanation
Explanation 1:

Apply operations on A[2] and A[4]
A = [3, 2, 2, 2, 2]
Maximum occurence =  4
Minimum value of element with maximum occurence = 2
Explanation 2:

A = [5, 5, 5]
Maximum occurence =  3
Minimum value of element with maximum occurence = 5*/


import java.util.Arrays;

public class Problem5 {

    public int[] solve(int[] A, int B) {


        //Array sort in descending order

        Arrays.sort(A);

        long prefix[] = new long[A.length+1];

        prefix[0] = 0;

        for(int i =1; i<= A.length; i++){

            prefix[i] = prefix[i-1] + A[i-1];

        }

        int max_count = -1;
        int max_num = -1;

        for(int i = 0; i< A.length; i++){

            int l = 1;
            int r = i + 1;

            while(l <= r){


                int mid = (l + r) / 2;

                long sum = prefix[i + 1] - prefix[i + 1 - mid];

                if((1L* A[i] *mid) - sum <= B){

                    if(mid > max_count){
                        max_count = mid;
                        max_num = A[i];
                    }

                    l = mid +1;
                }
                else{

                    r = mid -1;
                }

            }
        }

        return new int[]{max_count, max_num};

    }

}
