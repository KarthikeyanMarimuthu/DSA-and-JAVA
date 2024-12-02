package com.advanced.module2.assignments;

/*

Q1. Square Root of Integer
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an integer A. Compute and return the square root of A.
If A is not a perfect square, return floor(sqrt(A)).

NOTE:
The value of A*A can cross the range of Integer.
Do not use the sqrt function from the standard library.
Users are expected to solve this in O(log(A)) time.


        Problem Constraints
0 <= A <= 109


Input Format
The first and only argument given is the integer A.


Output Format
Return floor(sqrt(A))


Example Input
Input 1:

        11
Input 2:

        9


Example Output
Output 1:

        3
Output 2:

        3
*/



public class Problem5 {

    public int sqrt(int A) {

        int l = 1;
        int r = A;

        int ans = 0;

        while(l <= r){

            int mid = l + (r-l) /2;

            if( mid <= (A / mid)){

                ans = mid;
                l = mid + 1;
            }
            else{

                r = mid - 1;
            }
        }

        return ans;
    }
}
