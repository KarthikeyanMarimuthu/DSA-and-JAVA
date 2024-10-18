package com.additionalProblems;

/*
Q1. N/3 Repeat Number
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Note: Read-only array means that the input array should not be modified in the process of solving the problem



Problem Constraints
1 <= N <= 7*105
        1 <= A[i] <= 109


Input Format
The only argument is an integer array A.


Output Format
Return an integer.


        Example Input
Input 1:
        [1 2 3 1 1]
Input 2:
        [1 2 3]


Example Output
Output 1:
        1
Output 2:
        -1
*/


public class Problem23 {

    public int repeatedNumber(int[] A) {


        // if N/3 is majority then there could be max of 2 majority elemnts

        if(A.length ==1){
            return A[0];
        }

        int first = A[0];
        int second = -1;

        int count_first = 1;
        int count_second = 0;

        for(int i=1; i< A.length; i++){


            if(A[i] == first){

                count_first++;
            }

            else if(A[i] == second){
                count_second++;
            }
            else if(count_first ==0){

                first = A[i];
                count_first++;
            }
            else if(count_second == 0){

                second = A[i];
                count_second++;

            }
            else{
                count_first--;
                count_second--;
            }
        }


        int total_first = 0;
        int total_second = 0;

        for(int i =0 ; i< A.length; i++){

            if(A[i]==first){
                total_first++;
            }

            if(A[i]==second){
                total_second++;
            }
        }

        if(total_first > (A.length/3)){

            return first;
        }
        else if(total_second > (A.length/3)){
            return second;
        }

        return -1;


    }
}
