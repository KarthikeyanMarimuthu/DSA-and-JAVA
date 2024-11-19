package com.advanced.module1.additional;

/*
Q3. Longest Subarray Zero Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of N integers.
Find the length of the longest subarray in the array which sums to zero.

If there is no subarray which sums to zero then return 0.



Problem Constraints
1 <= N <= 105
        -109 <= A[i] <= 109


Input Format
Single argument which is an integer array A.


Output Format
Return an integer.


        Example Input
Input 1:

A = [1, -2, 1, 2]
Input 2:

A = [3, 2, -1]


Example Output
Output 1:

        3
Output 2:

        0


Example Explanation
Explanation 1:

        [1, -2, 1] is the largest subarray which sums up to 0.
Explanation 2:

No subarray sums up to 0.*/


import java.util.HashMap;
import java.util.Map;

public class Problem29 {
    public int solve(int[] A) {

        Long sum = 0L;

        int ans = 0;

        Map<Long, Integer> map = new HashMap<>();

        for(int i = 0; i< A.length; i++){

            sum = sum + A[i];

            if(map.containsKey(sum)){

                ans = Math.max(ans, i - map.get(sum));
            }
            else{

                map.put(sum, i);
            }
            if(sum == 0){

                ans = Math.max(ans, i+1);
            }
        }

        return ans;
    }
}
