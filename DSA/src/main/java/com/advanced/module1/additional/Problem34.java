package com.advanced.module1.additional;

/*

Q1. Wave Array
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of integers A, sort the array into a wave-like array and return it.
In other words, arrange the elements into a sequence such that

a1 >= a2 <= a3 >= a4 <= a5.....
NOTE: If multiple answers are possible, return the lexicographically smallest one.



Problem Constraints
1 <= len(A) <= 106
        0 <= A[i] <= 106



Input Format
The first argument is an integer array A.



Output Format
Return an array arranged in the sequence as described.



        Example Input
Input 1:

A = [1, 2, 3, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:

        [2, 1, 4, 3]
Output 2:

        [2, 1]


Example Explanation
Explanation 1:

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
First answer is lexicographically smallest. So, return [2, 1, 4, 3].
Explanation 1:

Only possible answer is [2, 1].

*/

public class Problem34 {

    public int[] wave(int[] A) {

        //Quick sort

        quickSort(A, 0, A.length - 1);

        for (int i = 0; i < A.length - 1; i += 2) {


            int temp = A[i];

            A[i] = A[i + 1];
            A[i + 1] = temp;
        }

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

        int pivot = A[start];

        int l = start + 1;
        int r = end;


        while (l <= r) {

            if (A[l] <= pivot) {

                l++;
            } else if (A[r] > pivot) {

                r--;
            } else {

                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;

                l++;
                r--;
            }
        }

        int temp = A[r];

        A[r] = A[start];
        A[start] = temp;

        return r;


    }
}
