package com.advanced.module1.assignments;

/*
Q3. Subarray Sum Equals K
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.


        Problem Constraints
 1 <= length of the array <= 50000
        -1000 <= A[i] <= 1000


Input Format
The first argument given is the integer array A.
The second argument given is integer B.


        Output Format
Return the total number of subarrays having sum equals to B.


        Example Input
Input 1:
A = [1, 0, 1]
B = 1
Input 2:
A = [0, 0, 0]
B = 0


Example Output
Output 1:
        4
Output 2:
        6


Example Explanation
Explanation 1:
        [1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.
Explanation 1:
All the possible subarrays having sum 0.*/

import java.util.HashMap;
import java.util.Map;

public class Problem36 {

    public int solve(int[] A, int B) {

        int prefix[] = new int[A.length];

        Map<Integer, Integer> map = new HashMap<>();

        prefix[0] = A[0];

        int ans = 0;
        int sum = 0;
        for(int i = 0; i< A.length; i++){

            sum = sum + A[i];

            prefix[i] = sum;

            if(prefix[i]==B){

                ans++;
            }

            int pair = prefix[i] - B;

            if(map.containsKey(pair)){

                ans = ans + map.get(pair);
            }

            if(map.containsKey(prefix[i])){

                map.put(prefix[i], map.get(prefix[i])+1);
            }

            else{
                map.put(prefix[i], 1);
            }

        }

        return ans;




    }
}
