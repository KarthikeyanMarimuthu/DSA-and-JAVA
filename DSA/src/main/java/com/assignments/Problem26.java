package com.assignments;

/*
Q1. Toggle Case
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



        Problem Constraints
1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format
First and only argument is a character string A.



        Output Format
Return a character string.



Example Input
Input 1:

A = "Hello"
Input 2:

A = "tHiSiSaStRiNg"


Example Output
Output 1:

hELLO
Output 2:

ThIsIsAsTrInG


Example Explanation
Explanation 1:

        'H' changes to 'h'
        'e' changes to 'E'
        'l' changes to 'L'
        'l' changes to 'L'
        'o' changes to 'O'
Explanation 2:

        "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".*/

public class Problem26 {

    public String solve(String A) {



        // A - Z (65 - 90)
        // a - z (97 - 122)

        char arr[] = A.toCharArray();

        for(int i = 0; i< arr.length; i++){

            if(arr[i]>='A' && arr[i]<='Z'){

                arr[i] = (char) (arr[i] + 32) ;
            }

            else if(arr[i]>='a' && arr[i]<='z'){

                arr[i] = (char) (arr[i] - 32) ;
            }
        }

        return new String(arr);
    }
}
