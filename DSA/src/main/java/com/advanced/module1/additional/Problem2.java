package com.advanced.module1.additional;


/*Q2. Flip
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.



        Problem Constraints
1 <= size of string <= 100000



Input Format
First and only argument is a string A.



Output Format
Return an array of integers denoting the answer.



Example Input
Input 1:

A = "010"
Input 2:

A = "111"


Example Output
Output 1:

        [1, 1]
Output 2:

        []*/


public class Problem2 {

    public int[] flip(String A) {

        // Kadane's algorithm
        char arr[] = A.toCharArray();

        int run_sum = 0;
        int max_sum = 0;

        int l =0;
        int r = 0;

        int res []= new int[2];

        for(int i = 0; i< arr.length; i++){

            if(arr[i]=='1'){

                run_sum = run_sum -1;
            }
            else{
                run_sum = run_sum + 1;
            }

            if(run_sum > max_sum){

                max_sum = run_sum;
                res[0] = l + 1;
                res[1] = r + 1;
            }

            if(run_sum < 0){

                run_sum = 0;

                l = i + 1;
                r = i + 1;
            }

            else{
                r = r + 1;
            }
        }

        if(max_sum ==0){
            return new int[0];
        }

        return res;

    }
}
