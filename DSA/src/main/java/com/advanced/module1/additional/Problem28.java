package com.advanced.module1.additional;

/*

Q2. Subarray with given sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single integer "-1".

First sub-array means the sub-array for which starting index in minimum.



        Problem Constraints
1 <= length of the array <= 100000
        1 <= A[i] <= 109
        1 <= B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



        Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single integer "-1".



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 5
Input 2:

A = [5, 10, 20, 100, 105]
B = 110


Example Output
Output 1:

        [2, 3]
Output 2:

        [-1]


Example Explanation
Explanation 1:

        [2, 3] sums up to 5.
Explanation 2:

No subarray sums up to required number.

*/


import java.util.HashMap;
import java.util.Map;

public class Problem28 {

    public int[] solve(int[] A, int B) {


        long sum = 0;

        Map<Long, Integer> map = new HashMap<>();
        int s = -1;
        int e = -1;

        map.put(sum, -1);

        for(int i =0; i< A.length; i++){

            sum = sum + A[i];

            if(map.containsKey(sum - B)){

                s = map.get(sum - B) + 1;
                e = i;
                break;
            }

            map.put(sum, i);
        }

        if(s==-1){

            return new int[] {-1};
        }

        int res [] = new int[e-s+1];
        for(int i = s; i<=e; i++){

            res[i -s] = A[i];

        }

        return res;
    }
}
