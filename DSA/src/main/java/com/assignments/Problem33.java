package com.assignments;

/*Q3. Count Increasing Triplets
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]


Problem Constraints
1 <= N <= 103
        1 <= A[i] <= 109


Input Format
First argument A is an array of integers.


Output Format
Return an integer.


        Example Input
Input 1:
A = [1, 2, 4, 3]
Input 2:
A = [2, 1, 2, 3]


Example Output
Output 1:
        2
Output 2:
        1*/


public class Problem33 {

    public int solve(int[] A) {

        int ans = 0;
        for(int i = 0; i< A.length ; i++){

            int l = 0, r =0;

            // left side;
            int j = i -1;
            while( j>=0 ){

                if(A[j]<A[i]){
                    l++;
                }

                j--;
            }

            j = i+1;
            while(j < A.length){

                if(A[j]>A[i]){
                    r++;
                }
                j++;
            }


            ans = ans + (l * r);



        }

        return ans;
    }
}
