package com.assignments;


/*Q7. Add Binary Strings
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given two binary strings A and B. Return their sum (also a binary string).


Problem Constraints
1 <= length of A <= 105

        1 <= length of B <= 105

A and B are binary strings



Input Format
The two argument A and B are binary strings.



        Output Format
Return a binary string denoting the sum of A and B



Example Input
Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"


Example Output
Output 1:
        "111"
Output 2:
        "1000"


Example Explanation
For Input 1:
The sum of 100 and 11 is 111.
For Input 2:

The sum of 110 and 10 is 1000.*/

public class Problem30 {

    public String addBinary(String A, String B) {

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        StringBuilder sb = new StringBuilder();

        int carry = 0;

        int i = a.length-1, j = b.length-1;

        while( i >=0 || j >=0 || carry!=0){
            int sum =0;
            if(i >= 0){
                sum +=Integer.parseInt(a[i]+"");
                i--;
            }
            if(j >= 0){
                sum +=Integer.parseInt(b[j]+"");
                j--;
            }
            if(carry!=0){

                sum +=carry;
            }

            int ans = sum % 2;
            carry = sum /2;

            sb.append(ans);

        }
        return sb.reverse().toString();


    }


}
