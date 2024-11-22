package com.advanced.module1.assignments;


/*

Q3. Merge Sort
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an integer array A, sort the array using Merge Sort.


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
Return the sorted array.
*/



public class Problem40 {

    public int[] solve(int[] A) {


        sort(A, 0, A.length -1);

        return A;
    }

    public static void sort(int A[], int left, int right){

        //base condition
        if(left == right){

            return;
        }

        int mid = (left + right) / 2;

        sort(A, left, mid);
        sort(A, mid+1, right);
        merge(A, left, mid, right);


    }

    public static void merge(int A[], int left, int mid, int right){

        // Create two arrays

        int n1 = mid - left + 1;
        int n2 = right - (mid + 1) + 1;

        int B[] = new int[n1];
        int C[] = new int[n2];

        int k = 0;
        for(int i = left; i <= mid; i++){

            B[k] = A[i];
            k++;
        }

        k = 0;
        for(int i = mid+1; i <= right; i++){

            C[k] = A[i];
            k++;
        }


        //merge
        int b = 0;
        int c = 0;
        k = left;

        while(b < n1 && c < n2){

            if(B[b] <= C[c]){

                A[k] = B[b];

                k++;
                b++;

            }

            else{

                A[k] = C[c];

                k++;
                c++;
            }

        }


        while(b < n1){

            A[k] = B[b];

            k++;
            b++;
        }

        while(c < n2){

            A[k] = C[c];

            k++;
            c++;
        }
    }
}
