package com.advanced.module1.additional;

/*
Q4. Find Two Missing Numbers
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of length N where all the elements are distinct and are in the range [1, N+2].

Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.



        Problem Constraints
1 <= N <= 105

        1 <= A[i] <= N+2

The elements of array A are distinct



Input Format
Only argument A is an array of integers



Output Format
Return a sorted array of size 2 denoting the missing elements.



Example Input
Input 1:
A = [3, 2, 4]
Input 2:
A = [5, 1, 3, 6]


Example Output
Output 1:
        [1, 5]
Output 2:
        [2, 4]


Example Explanation
For Input 1:
The missing numbers are 1 and 5.
For Input 2:
The missing numbers are 2 and 4.

*/

import java.util.Arrays;

public class Problem12 {

    public int[] solve(int[] A) {

        // Getting XOR of all the values

        int xor = 0;

        for(int i= 0; i< A.length; i++){

            xor = xor ^ A[i];
        }

        for(int i =1; i<= A.length+2; i++){

            xor = xor ^ i;
        }

        int pos = -1;
        for(int i =0 ; i< 32; i++){

            if((xor & (1 << i)) > 0){

                pos = i;
                break;
            }
        }

        int a =0, b=0;




        for(int i = 1; i<=A.length+2; i++){

            if((i & (1 << pos)) >0){

                a = a^i;
            }

            else{

                b = b^i;
            }
        }

        for(int i = 0; i<A.length; i++){

            if((A[i] & (1 << pos)) >0){

                a = a^A[i];
            }

            else{

                b = b^A[i];
            }
        }




        int res [] = new int[2];

        res[0] = a;
        res[1] = b;

        Arrays.sort(res);

        return res;




    }
}
