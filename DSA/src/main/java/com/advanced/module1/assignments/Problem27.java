package com.advanced.module1.assignments;

/*

Q1. Implement Power Function
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.


        Problem Constraints
-109 <= A <= 109
        0 <= B <= 109
        1 <= C <= 109


Input Format
Given three integers A, B, C.


Output Format
Return an integer.


        Example Input
Input 1:
A = 2
B = 3
C = 3
Input 2:
A = 3
B = 3
C = 1


Example Output
Output 1:
        2
Output 2:
        0
*/

public class Problem27 {

    public int pow(int A, int B, int C) {
        // Ensure A is within the range [0, C-1]

        if (C == 1) {
            return 0;
        }
        A = A % C;

        // Use the recursive method to calculate (A^B) % C
        return (int) (getPow(A, B, C)+C)%C;
    }

    public long getPow(int A, int B, int C) {
        // Base case: A^0 % C = 1
        if (B == 0) {
            return 1;
        }

        // Recursive step: Calculate A^(B/2) % C
        long ans = getPow(A, B / 2, C);

        // If B is even, result is (A^(B/2) % C)^2 % C
        ans = (ans * ans) % C;

        // If B is odd, result is (A^(B/2) % C)^2 * A % C
        if (B % 2 != 0) {
            ans = (ans * A) % C;
        }

        return ans;
    }
}
