package com.assignments;


/*Q6. Special Subsequences "AG" - 2
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an long integer denoting the answer.



        Example Input
Input 1:

A = "ABCGAG"
Input 2:

A = "GAB"


Example Output
Output 1:

        3
Output 2:

        0


Example Explanation
Explanation 1:

Subsequence "AG" is 3 times in given string, the pairs are (0, 3), (0, 5) and (4, 5).
Explanation 2:

There is no subsequence "AG" in the given string.*/

public class Problem13 {

    public long solve(String A) {


        //carry forward

        long countA = 0;
        long res = 0;

        long [] carryForward = new long[A.length()];

        for(int i = 0; i< A.length(); i++){

            if(A.charAt(i) =='A'){
                countA +=1;

            }
            carryForward[i] = countA;
        }

        for(int i =0; i< A.length(); i++){

            if(A.charAt(i) =='G'){

                res +=carryForward[i];
            }
        }

        return res;

    }
}
