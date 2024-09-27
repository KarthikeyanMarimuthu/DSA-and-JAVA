package com.assignments;


/*Q4. Subarray in given range
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of length N, return the subarray from B to C.


Problem Constraints
1 <= N <= 105

        1 <= A[i] <= 109

        0 <= B <= C < N



Input Format
The first argument A is an array of integers

The remaining argument B and C are integers.



Output Format
Return a subarray


Example Input
Input 1:
A = [4, 3, 2, 6]
B = 1
C = 3
Input 2:

A = [4, 2, 2]
B = 0
C = 1


Example Output
Output 1:
        [3, 2, 6]
Output 2:

        [4, 2]


Example Explanation
Explanation 1:
The subarray of A from 1 to 3 is [3, 2, 6].
Explanation 2:
The subarray of A from 0 to 1 is [4, 2].*/

public class Problem11 {

    public int[] solve(int[] A, int B, int C) {


        int [] res = new int[C-B+1];


        for(int i = B; i <=C; i++){
            // i will be growing so , I should be first
            res[i -B] = A[i];
        }

        return res;
    }
}
