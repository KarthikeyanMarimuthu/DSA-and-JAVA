package com.additionalProblems;

/*Q1. Longest Common Prefix
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

        Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints
0 <= sum of length of all strings <= 1000000



Input Format
The only argument given is an array of strings A.



Output Format
Return the longest common prefix of all strings in A.



Example Input
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];


Example Output
Output 1:

        "a"
Output 2:

        "ab"


Example Explanation
Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".*/

public class Problem19 {

    public String longestCommonPrefix(String[] A) {

        StringBuilder sb = new StringBuilder();


        int min_size = Integer.MAX_VALUE;
        for(int i =0 ; i< A.length; i++){

            int length = A[i].length();

            min_size = Math.min(min_size, length);


        }

        for(int i = 0 ; i< min_size; i++){

            char des = A[0].charAt(i);
            boolean same = true;
            for(int j = 1; j< A.length; j++){

                if(A[j].charAt(i) != des){
                    same=false;
                    break;

                }

            }
            if(same){
                sb.append(des);

            }
            else{
                break;
            }
        }

        return sb.toString();
    }

}
