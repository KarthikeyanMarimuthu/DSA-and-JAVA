package com.additionalProblems;

/*Q2. Count Occurrences
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.



        Problem Constraints
1 <= |A| <= 1000


Input Format
The first and only argument contains the string A, consisting of lowercase English alphabets.


        Output Format
Return an integer containing the answer.


Example Input
Input 1:

        "abobc"
Input 2:

        "bobob"


Example Output
Output 1:

        1
Output 2:

        2


Example Explanation
Explanation 1:

The only occurrence is at second position.
        Explanation 2:

Bob occures at first and third position.*/

public class Problem20 {


    public int solve(String A) {


        String s = "bob";

        char arr[] = A.toCharArray();

        int ans = 0;

        int i = 0;

        while(i <= arr.length - s.length() ){

            if(s.equals(new String(arr, i, s.length()))){

                ans++;
            }
            i++;

        }

        return ans;
    }
}
