package com.advanced.module1.assignments;

/*

Q4. Print Array using Recursion
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array A. Print the elements of the array using recursion.

NOTE :
You are required to not use any loops, You can create new functions.
        Don't change the signature of the function PrintArray.
Print a new empty line after printing the output.


Problem Constraints
1 <= | A | <= 100
        -1000 <= A[i] <= 1000


Input Format
One line containing the array A


Output Format
Print the elements of the array in the sequential order.


Example Input
Input 1 :
A = [6, -2, 5, 3]
Input 2 :
A = [1]


Example Output
Output 1 :
        6 -2 5 3
Output 2 :
        1

*/

public class Problem25 {

    public void PrintArray(int[] A) {

        print(A, 0);
        System.out.println();

    }

    public static void print(int[] A, int i){

        if(i >= A.length){

            return;
        }

        System.out.print(A[i]+ " ");
        print(A, i+1);
    }
}
