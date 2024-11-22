package com.advanced.module1.additional;

/*

Q2. Count Sort
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.


        Problem Constraints
1 <= |A| <= 105
        1 <= A[i] <= 105


Input Format
The first argument is an integer array A.


Output Format
Return an integer array that is the sorted array A.


Example Input
Input 1:
A = [1, 3, 1]
Input 2:
A = [4, 2, 1, 3]


Example Output
Output 1:
        [1, 1, 3]
Output 2:
        [1, 2, 3, 4]


Example Explanation
For Input 1:
The array in sorted order is [1, 1, 3].
For Input 2:
The array in sorted order is [1, 2, 3, 4].
*/


public class Problem32 {

    public int[] solve(int[] A) {

        int max = Integer.MIN_VALUE;

        for(int i =0; i< A.length; i++){

            if(A[i] > max){
                max = A[i];
            }
        }

        int freq[] = new int[max+1];



        for(int i = 0; i< A.length; i++){

            freq[A[i]] = freq[A[i]] + 1;

        }

        int k =0;
        for(int i = 0; i < freq.length; i++){

            if(freq[i] != 0){

                for(int j = 0; j< freq[i]; j++){

                    A[k] = i;
                    k++;
                }
            }
        }

        return A;
    }
}
