package com.advanced.module1.assignments;

/*

Q5. Partition Index
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer array A of length N, considering the last element as pivot p, rearrange the elements such that for all i:

        if A[i] < p then it should be present on left side of the partition
if A[i] > p then it should be present on right side of the partition
Rearrange the given array as well as return the partition index.

        Note: All elements are distinct



Problem Constraints
1 ≤ N ≤ 105

        1 ≤ A[i] ≤ 109



Input Format
The only input argument is the given vector A.



        Output Format
Return the partition index as well as rearrange the input array to satisfy the given conditions.



Example Input
Input:

A = [6, 2, 0, 4, 5]


Example Output

Output:

Valid
A possible solution can be:
A = [2, 0, 4, 5, 6] and partitionIndex = 3


Example Explanation
Explanation:

The rearrangement is valid because every element in [0, 2] index range is less than the pivot element, and every element in [3, 4] index range is greater than the pivot element.

*/


public class Problem47 {

    public int partition(int[] A) {
        // code here

        int pivot = A[A.length - 1];
        int l = 0;
        int r = A.length - 2;

        while (l <= r) {

            if (A[l] <= pivot) {

                l++;
            } else if (A[r] > pivot) {
                r--;
            } else {

                //Swap
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;

                l++;
                r--;
            }

        }

        int temp = A[l];
        A[l] = A[A.length - 1];

        A[A.length - 1] = temp;

        return l;

    }
}
