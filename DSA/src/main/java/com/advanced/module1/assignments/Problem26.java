package com.advanced.module1.assignments;

/*

Q5. Fast Power
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given two positive integers A and B. Implement Fast Power function to compute AB

Note : Please use the approach taught in the class.



Problem Constraints
AB would fit in 64-bit type integer.


        Input Format
Two integers A and B


Output Format
Single integer denoting the answer to AB


Example Input
Input 1 :
A = 2 , B = 10
Input 2 :
A = 1 , B = 100000000


Example Output
Output 1 :
        1024
Output 2 :
        1


Example Explanation
For Input 1 :
        210 = 25 * 25
        25 = 32, so 32 * 32 = 1024
For Input 2 :
        1 raised to power anything is 1
*/

public class Problem26 {

    public long power(int A, int B) {

        return getPower(A, B);

    }

    public static long getPower(int A, int B){

        if(B==0){

            return 1;
        }
        long ans = getPower(A, B/2);

        if(B % 2 == 0){

            return ans * ans;
        }



        return ans * ans * A;





    }
}
