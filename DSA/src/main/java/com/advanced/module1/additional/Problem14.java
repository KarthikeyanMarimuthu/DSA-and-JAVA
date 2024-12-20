package com.advanced.module1.additional;

/*

Q3. Decreasing Increasing in one Function
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Print N numbers in Decreasing Order and then in Increasing Order.

You are given a positive number N.
You are required to print the numbers from N to 1.
You are required to not use any loops. Don't change the signature of the function DecThenInc function.
Note : Please print an new line after printing the output.


        Problem Constraints
1 <= N <= 100


Input Format
The first line contains a single integer N.


Output Format
A single line having number printed from N to 1 and then from 1 to N.


Example Input
Input 2:
        1
Input 1:
        4


Example Output
Output 1:
        1 1
Output 2:
        4 3 2 1 1 2 3 4
*/



public class Problem14 {

    public void DecThenInc(int A) {

        incrementAndDecrement(A);
        System.out.println();
    }

    public static void incrementAndDecrement(int A){

        if(A== 0){

            return;
        }

        System.out.print(A+" ");
        incrementAndDecrement(A-1);
        System.out.print(A+" ");
    }
}
