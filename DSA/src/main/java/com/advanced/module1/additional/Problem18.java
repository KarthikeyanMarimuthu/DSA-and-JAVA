package com.advanced.module1.additional;

/*

Q4. Last Index using Recursion
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array A of size N. Write a recursive function that returns the last index at which an integer B is found in the array.

        NOTE: If B is not found anywhere in the array then return -1.


Problem Constraints
1 <= N <= 100
        -1000 <= A[i] <= 1000
        -1000 <= B <= 1000


Input Format
The function contains two arguments.
The first argument is the array A.
The second argument is the element B that is to be searched.


Output Format
Return the last Index of B from the list in integer format if B is present in the array, else return -1.


Example Input
Input 1 :
A = [6, 5, 6, 2]
B = 6
Input 2 :
A = [0, 1, 0, 2]
B = 3


Example Output
Ouput 1 :
        2
Ouput 2 :
        -1
*/


public class Problem18 {

    public int LastIndex(int[] A, int B) {

        return last(A, B, A.length-1);

    }

    public static int last(int[] A, int B, int i){

        if(i < 0){

            return -1;
        }

        if(A[i] == B){

            return i;
        }

        else{
            return last(A, B, i-1);
        }
    }
}
