package com.advanced.module1.additional;

/*
Q1. Add One To Number
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

        NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


        Problem Constraints
1 <= size of the array <= 1000000



Input Format
First argument is an array of digits.



        Output Format
Return the array of digits after adding one.



Example Input
Input 1:

        [1, 2, 3]


Example Output
Output 1:

        [1, 2, 4]


Example Explanation
Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.*/

import java.util.ArrayList;

public class Problem1 {

    public int[] plusOne(int[] A) {


        ArrayList<Integer> res = new ArrayList<>();



        int i = 0, j = A.length -1;

        while(i < j){

            int temp = A[i];
            A[i] = A[j];

            A[j] = temp;

            i++;
            j--;
        }

        int carry =1;
        for(i = 0; i< A.length; i++){

            int digit = A[i] + carry;

            if(digit ==10){

                digit = 0;
                carry = 1;
            }
            else{
                carry =0;
            }

            res.add(digit);
        }

        if(carry ==1){
            res.add(carry);
        }

        for(i = res.size() -1; i >=0 ; i--){

            if(res.get(i) == 0){
                res.remove(i);
            }
            else{
                break;
            }
        }

        int res_arr[] = new int[res.size()];

        for( i = 0; i <res.size(); i++){

            res_arr[res_arr.length -1 -i] = res.get(i);
        }

        return res_arr;
    }
}
