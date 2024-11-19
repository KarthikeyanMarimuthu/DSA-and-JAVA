package com.advanced.module1.assignments;

/*

1. Longest Substring Without Repeat
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length of the longest substring that contains no repeating characters. The greater the length of this unique-character substring, the higher the "GOOD"ness of the string.

Your task is to return an integer representing the "GOOD"ness of string A.

Note: The solution should be achieved in O(N) time complexity, where N is the length of the string.



Problem Constraints
1 <= size(A) <= 106

String consists of lowerCase,upperCase characters and digits are also present in the string A.



Input Format
Single Argument representing string A.



        Output Format
Return an integer denoting the maximum possible length of substring without repeating characters.



        Example Input
Input 1:

A = "abcabcbb"
Input 2:

A = "AaaA"


Example Output
Output 1:

        3
Output 2:

        2


Example Explanation
Explanation 1:

Substring "abc" is the longest substring without repeating characters in string A.
Explanation 2:

Substring "Aa" or "aA" is the longest substring without repeating characters in string A.

*/

import java.util.HashSet;
import java.util.Set;

public class Problem34 {

    public int lengthOfLongestSubstring(String A) {


        Set<Character> set = new HashSet<>();

        char arr[] = A.toCharArray();

        if(arr.length == 1){

            return 1;
        }

        if(arr.length == 0){

            return 0;
        }

        int ans = Integer.MIN_VALUE;
        int s = 0;

        for(int i =0; i<arr.length; i++){

            while(set.contains(arr[i])){

                set.remove(arr[s]);

                s++;
            }
            set.add(arr[i]);

            ans = Math.max(ans, set.size());
        }

        return ans;
    }
}
