package com.advanced.module1.additional;

/*
Q3. Count Pair Difference
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.


Problem Constraints
1 <= N <= 105
        1 <= A[i] <= 109
        1 <= B <= 109


Input Format
First argument A is an array of integers and second argument B is an integer.


        Output Format
Return an integer.


        Example Input
Input 1:

A = [3, 5, 1, 2]
B = 4
Input 2:

A = [1, 2, 1, 2]
B = 1


Example Output
Output 1:

        1
Output 2:

        4


Example Explanation
Example 1:

The only pair is (2, 3) which gives difference as 4
Example 2:

The pair which gives difference as 3 are (2, 1), (4, 1), (2, 3) and (4, 3).
*/


import java.util.HashMap;
import java.util.Map;

public class Problem26 {

    public int solve(int[] A, int B) {


        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        int mod = 1000000007;

        for(int i = 0; i< A.length; i++){

            // Pairs we are calculating meaning (1,3) is a pair an (3,1) is also an pair
            int diff = A[i] + B;

            int sum = A[i] - B;

            if(map.containsKey(sum)){
                ans = ((ans % mod) + (map.get(sum)%mod) % mod);
            }

            if(map.containsKey(diff)){
                ans = ((ans % mod) + (map.get(diff)%mod) % mod);
            }

            if(!map.containsKey(A[i])){

                map.put(A[i], 1);
            }

            else{

                map.computeIfPresent(A[i], (k,v) -> v+1);
            }
        }

        return ans % mod;
    }
}
