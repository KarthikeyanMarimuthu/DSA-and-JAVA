package com.advanced.module1.assignments;


/*
Q5. Check bit
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.


Problem Constraints
1 <= A <= 109
        0 <= B <= 30


Input Format
First argument A is an integer.
Second argument B is an integer.


Output Format
Return an integer.


        Example Input
Input 1:
A = 4
B = 1
Input 2:
A = 5
B = 2


Example Output
Output 1:
        0
Output 2:
        1


Example Explanation
For Input 1:
Given N = 4 which is 100 in binary. The 1-st bit is unset
so we return 0
For Input 2:
Given N = 5 which is 101 in binary. The 2-nd bit is set
so we return 1
*/


public class Problem13{

    public int solve(int A, int B) {


        int res = A & (1 << B);

        if(res > 0){
            return 1;
        }

        return 0;
    }
}
