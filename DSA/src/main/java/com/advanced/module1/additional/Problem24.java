package com.advanced.module1.additional;

/*

Q1. Count unique elements
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.


Problem Constraints
1 <= N <= 105
        1 <= A[i] <= 109


Input Format
First argument A is an array of integers.


Output Format
Return an integer.


        Example Input
Input 1:
A = [3, 4, 3, 6, 6]
Input 2:
A = [3, 3, 3, 9, 0, 1, 0]


Example Output
Output 1:
        1
Output 2:
        2


Example Explanation
Explanation 1:
Only the element 4 has a frequency 1.
Explanation 2:
The elements 9 and 1 has a frequncy 1.
*/


import java.util.HashMap;
import java.util.Map;

public class Problem24 {

    public int solve(int[] A) {

        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< A.length; i++){

            if(!map.containsKey(A[i])){

                map.put(A[i],1);
            }

            else{

                map.computeIfPresent(A[i], (k,v) -> v+1);
            }
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){

            if(e.getValue() == 1){
                count ++;
            }
        }

        return count;


    }
}
