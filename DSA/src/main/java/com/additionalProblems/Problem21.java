package com.additionalProblems;


/*Q3. Amazing Subarrays
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
        Example

Input
        ABEC

Output
    6

Explanation
Amazing substrings of given string are :
        1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
here number of substrings are 6 and 6 % 10003 = 6.*/

public class Problem21 {

    public int solve(String A) {

        char arr[] = A.toCharArray();



        int sum = 0; int mod = 10003;
        for(int i = 0; i< arr.length; i++ ){

            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||     arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' ){

                // Contribution Technique we should consider only the Start index so (N-i)
                sum = (sum + (arr.length - i)%mod)%mod;
            }
        }

        return sum ;
    }
}
