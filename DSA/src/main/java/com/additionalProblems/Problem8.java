package com.additionalProblems;


/*
Q2. Leaders in an array
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.


        Problem Constraints
1 <= N <= 105
        1 <= A[i] <= 108


Input Format
There is a single input argument which a integer array A


Output Format
Return an integer array denoting all the leader elements of the array.


Example Input
Input 1:
A = [16, 17, 4, 3, 5, 2]
Input 2:
A = [5, 4]


Example Output
Output 1:
        [17, 2, 5]
Output 2:
        [5, 4]


Example Explanation
Explanation 1:
Element 17 is strictly greater than all the elements on the right side to it.
        Element 2 is strictly greater than all the elements on the right side to it.
        Element 5 is strictly greater than all the elements on the right side to it.
So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
Explanation 2:
Element 5 is strictly greater than all the elements on the right side to it.
        Element 4 is strictly greater than all the elements on the right side to it.
So we will return these two elements i.e [5, 4], we can also any other ordering.

*/

import java.util.ArrayList;
import java.util.List;

public class Problem8 {


    public int[] solve(int[] A) {

        List<Integer> resList = new ArrayList<>();

        resList.add(A[A.length - 1]);
        int max = A[A.length - 1];
        for (int i = A.length - 1; i >= 0; i--) {

            if (A[i] > max) {
                max = A[i];
                resList.add(A[i]);
            }

        }
        int resArr[] = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {

            resArr[i] = resList.get(i);
        }

        return resArr;

//BRute force
        //     List<Integer> res = new ArrayList<>();

        //     for(int i = 0; i<A.length; i++){
        //         boolean leader = true;
        //         for(int j = i+1; j < A.length;j++){

        //             if(A[i]> A[j]){
        //                 continue;
        //             }
        //             else{
        //                 leader = false;
        //                 break;
        //             }
        //         }
        //         if(leader){
        //             res.add(A[i]);
        //         }
        // }
        // int[] resArr = new int[res.size()];
        // for(int i = 0; i <res.size(); i++){
        //     resArr[i] = res.get(i);
        // }
        // return resArr;

    }
}