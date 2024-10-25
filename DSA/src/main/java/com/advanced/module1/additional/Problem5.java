package com.advanced.module1.additional;


/*Q1. Merge Intervals - 2
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.



Problem Constraints
0 <= |intervals| <= 105



Input Format
First argument is the vector of intervals

second argument is the new interval to be merged



Output Format
Return the vector of intervals after merging



Example Input
Input 1:

Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
Input 2:

Given intervals [1, 3], [6, 9] insert and merge [2, 6] .


Example Output
Output 1:

        [ [1, 5], [6, 9] ]
Output 2:

        [ [1, 9] ]


Example Explanation
Explanation 1:

        (2,5) does not completely merge the given intervals
Explanation 2:

        (2,6) completely merges the given intervals*/


import java.util.ArrayList;
import java.util.List;

public class Problem5 {


    public int[][] insert(int[][] A, int[] B) {


        List<int[]> list = new ArrayList<>();

        int i =0;

        for(i= 0; i< A.length; i++){

            int S1 = B[0];
            int E1 = B[1];


            int S2 = A[i][0];
            int E2 = A[i][1];

            // not correct point to merge bcoz A[i] is smaller than B
            if(E2 < S1){
                list.add(A[i]);
                continue;
            }
            else if( (E1 >= S2 && E2 >= S1)){

                B[0] = Math.min(S1, S2);
                B[1] = Math.max(E1, E2);
            }
            else{
                break;
            }

        }

        list.add(B);


        for(int j = i; j< A.length; j++){

            list.add(A[j]);
        }


        int res[][] = new int[list.size()][2];

        for( i = 0; i< res.length; i++){

            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }

        return res;
    }
}
