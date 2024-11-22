package com.advanced.module1.additional;

/*

Q3. Sort subarray with left and right index
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array A of integers of length N and two indices, B and C.

Your task is to sort the subarray [B, C] within the given array. The rest of the array should remain unchanged.



Problem Constraints
1 ≤ N ≤ 105

        0 ≤ A[i] ≤ 109

        0 ≤ B ≤ C ≤ N - 1



Input Format
First argument is the array A of length N. The next two arguments are the integers B and C.



Output Format
Return the array after sorting the [B, C] subarray.



        Example Input
Input:

A = [59, 11, 8, 91, 49, 44, 8]
B = 4
C = 6
Input 2:

A = [50, 40, 30, 20, 10]
B = 0
C = 3


Example Output
Output:

        [59, 11, 8, 91, 8, 44, 49]
Output:

        [20, 30, 40, 50, 10]


Example Explanation
Explanation 1:

Initially the subarray [B, C], i.e. A[4, 6] = [49, 44, 8].
After sorting this becomes [8, 44, 49].
It can be seen that this subarray gets sorted and rest of the array remains unchanged!
Explanation 2:

Initially the subarray [B, C], i.e. A[0, 3] = [50, 40, 30, 20].
After sorting this becomes [20, 30, 40, 50].
It can be seen that this subarray gets sorted and rest of the array remains unchanged!
*/



public class Problem33 {

    public int[] sortSubarray(int[] A, int B, int C) {


        sort(A, B, C);

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
