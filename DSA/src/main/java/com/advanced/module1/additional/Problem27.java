package com.advanced.module1.additional;
/*

Q1. Distinct Numbers in Window
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

        Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.



        Problem Constraints
1 <= N <= 106

        1 <= A[i] <= 109


Input Format
First argument is an integer array A
Second argument is an integer B.



Output Format
Return an integer array.



Example Input
Input 1:

A = [1, 2, 1, 3, 4, 3]
B = 3
Input 2:

A = [1, 1, 2, 2]
B = 1


Example Output
Output 1:

        [2, 3, 3, 2]
Output 2:

        [1, 1, 1, 1]


Example Explanation
Explanation 1:

A=[1, 2, 1, 3, 4, 3] and B = 3
All windows of size B are
 [1, 2, 1]
         [2, 1, 3]
         [1, 3, 4]
         [3, 4, 3]
So, we return an array [2, 3, 3, 2].
Explanation 2:

Window size is 1, so the output array is [1, 1, 1, 1].

*/

import java.util.HashMap;
import java.util.Map;

public class Problem27 {

    public int[] dNums(int[] A, int B) {

        Map<Integer, Integer> map = new HashMap<>();

        int s = 0;

        int e = B -1;

        for(int i = 0; i< B; i++){

            if(map.containsKey(A[i])){

                map.computeIfPresent(A[i], (k,v)-> v+1);
            }

            else{
                map.put(A[i], 1);
            }
        }

        int ans[] = new int[A.length - B + 1];

        ans[0] = map.size();
        int count = 1;


        // window shift

        s = s+1;
        e = e+1;

        while( s <= A.length - B){


            if(map.get(A[s-1])==1){

                map.remove(A[s-1]);
            }
            else{
                map.computeIfPresent(A[s-1], (k,v) -> v-1);
            }

            if(!map.containsKey(A[e])){

                map.put(A[e], 1);
            }
            else{
                map.computeIfPresent(A[e], (k,v) -> v+1);
            }

            ans[count] = map.size();

            s++;
            e++;

            count++;
        }

        return ans;
    }
}
