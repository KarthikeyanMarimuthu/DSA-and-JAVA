package com.assignments;


/*Q2. Simple Reverse
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.



        Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



        Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



        Example Input
Input 1:

A = "scaler"
Input 2:

A = "academy"


Example Output
Output 1:

        "relacs"
Output 2:

        "ymedaca"


Example Explanation
Explanation 1:

Reverse the given string.*/

public class Problem27 {


    public String solve(String A) {

        char arr[] = A.toCharArray();

        int i = 0, j = arr.length -1;

        while(i < j){

            char temp = arr[i];

            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
}
