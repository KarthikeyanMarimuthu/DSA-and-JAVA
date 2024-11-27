package com.advanced.module1.assignments;
/*
Q4. Quick Sort
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an integer array A, sort the array using Quick Sort.


Problem Constraints
1 <= |A| <= 105
        1 <= A[i] <= 109


Input Format
First argument is an integer array A.


        Output Format
Return the sorted array.


Example Input
Input 1:-
A = [1, 4, 10, 2, 1, 5]
Input 2:-
A = [3, 7, 1]


Example Output
Output 1:-
        [1, 1, 2, 4, 5, 10]
Output 2:-
        [1, 3, 7]


Example Explanation
Explanation 1 and 2:
Return the sorted array.*/


public class Problem46 {

    public int[] solve(int[] A) {

        quickSort(A, 0, A.length - 1);

        return A;
    }

    public static void quickSort(int A[], int start, int end) {

        if (start >= end) {
            return;
        }

        int pivot = sort(A, start, end);

        quickSort(A, start, pivot - 1);
        quickSort(A, pivot + 1, end);

    }

    public static int sort(int A[], int start, int end) {

        // To reduce time complexity
        int rnd = (int) (Math.random() * (end - start)) + start;
        int temp1 = A[rnd];
        A[rnd] = A[start];
        A[start] = temp1;


        int pivot = A[start];
        int l = start + 1;
        int r = end;

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

        int temp = A[start];
        A[start] = A[r];
        A[r] = temp;

        return r;


    }
}
