package com.assignments;



/*Q4. Longest Palindromic Substring
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



        Example Input
Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output
Output 1:
        "aaabaaa"
Output 2:
        "abba"


Example Explanation
Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".*/


public class Problem29 {

    public String longestPalindrome(String A) {


        // centre approach

        int ans = 0;

        char arr[] = A.toCharArray();

        int  left =0 ,right =0;
        for(int C =0; C< arr.length; C++){

            int l =C ,r = C;


            while(l >=0 && r < arr.length){

                if(arr[l] != arr[r]){
                    break;

                }
                l--;
                r++;
            }

            if((r-l-1) > ans){

                ans = r-l-1;
                left = l ;
                right = r;

            }

            l = C;
            r = C+1;
            while( l>=0 && r < arr.length){

                if(arr[l] != arr[r]){

                    break;
                }
                l--;
                r++;
            }

            if((r-l-1) > ans){

                ans = r-l-1;
                left = l ;
                right = r;

            }


        }

        return new String(arr, left +1, ans);


    }
}


