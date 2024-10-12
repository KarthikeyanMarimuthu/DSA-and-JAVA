package com.additionalProblems;

/*
Q4. Isalnum()
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



        Output Format
Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.



Example Input
Input 1:

A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2:

A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

        1
Output 2:

        0


Example Explanation
Explanation 1:

All the characters are alphanumeric.
        Explanation 2:

All the characters are NOT alphabets i.e ('#').
*/


public class Problem22 {

    public int solve(char[] A) {

        for(char c : A){

            // A - Z  --> 65 to 90
            // a - z  --> 97 to 122
            // 0 - 9  --> 48 to 57

            if((c >=65 && c <= 90) ||(c>=97 && c<=122) || (c >=48 && c<=57)){

                continue;
            }
            else{
                return 0;
            }
        }

        return 1;
    }
}
