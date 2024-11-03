package com.assignments;

/*Q2. Majority Element
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.



Problem Constraints
1 <= N <= 5*105
        1 <= num[i] <= 109


Input Format
Only argument is an integer array.


Output Format
Return an integer.


        Example Input
Input 1:
        [2, 1, 2]
Input 2:
        [1, 1, 1]*/

public class Problem32 {


    public int majorityElement(final int[] A) {

        // Moores's voting algorithm
        int majority_index = 0;
        int count = 1;
        for(int i = 1; i < A.length; i++){

            if(count == 0){
                majority_index = i;
                count = 1;
            }

            else{

                if(A[i] == A[majority_index]){
                    count++;
                }

                else{
                    count--;
                }
            }
        }

        int majority_occurences = 0;

        for(int i =0; i< A.length; i++){

            if(A[i]==A[majority_index]){
                majority_occurences++;
            }
        }



        return A[majority_index];
    }
}
