package com.advanced.module1.additional;

/*

Q4. Count Subarray Zero Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7


Problem Constraints
1 <= N <= 105
        -109 <= A[i] <= 109


Input Format
Single argument which is an integer array A.


Output Format
Return an integer.


        Example Input
Input 1:

A = [1, -1, -2, 2]
Input 2:

A = [-1, 2, -1]


Example Output
Output 1:

        3
Output 2:

        1


Example Explanation
Explanation 1:

The subarrays with zero sum are [1, -1], [-2, 2] and [1, -1, -2, 2].
Explanation 2:

The subarray with zero sum is [-1, 2, -1].


*/


import java.util.HashMap;
import java.util.Map;

public class Problem30 {

    public int solve(int[] A) {

        long prefix [] = new long[A.length];

        prefix[0] = A[0];

        int ans = 0;



        Map<Long, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i = 0; i< A.length; i++){

            sum = sum + A[i];
            prefix[i] = sum;

            if(prefix[i]== 0){

                ans++;
            }

            if(!map.containsKey(prefix[i])){
                map.put(prefix[i],1);
            }
            else{
                ans = ans + map.get(prefix[i]);
                map.computeIfPresent(prefix[i], (k,v) -> v+1);
            }


        }

        return ans;
    }
}
