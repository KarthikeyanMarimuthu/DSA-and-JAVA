package com.advanced.module2.additional;

/*

Q4. Find Smallest Again
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an integer array A of size N.

If we store the sum of each triplet of the array A in a new list, then find the Bth smallest element among the list.

        NOTE: A triplet consists of three elements from the array. Let's say if A[i], A[j], A[k] are the elements of the triplet then i < j < k.



Problem Constraints
3 <= N <= 500
        1 <= A[i] <= 108
        1 <= B <= (N*(N-1)*(N-2))/6



Input Format
The first argument is an integer array A.
The second argument is an integer B.



        Output Format
Return an integer denoting the Bth element of the list.



Example Input
Input 1:

A = [2, 4, 3, 2]
B = 3
Input 2:

A = [1, 5, 7, 3, 2]
B = 9


Example Output
Output 1:

        9
Output 2:

        14


Example Explanation
Explanation 1:

All the triplets of the array A are:

        (2, 4, 3) = 9
        (2, 4, 2) = 8
        (2, 3, 2) = 7
        (4, 3, 2) = 9

So the 3rd smallest element is 9.
*/


import java.util.Arrays;

public class Problem8 {

    public int solve(int[] A, int B) {

        Arrays.sort(A);

        int N = A.length;
        int l = 1;

        int r = A[N-1] + A[N-2] + A[N-3];

        int ans = -1;

        while(l <= r){

            int mid = (l + r) / 2;

            int count = countTriplet(A, mid);

            if(count < B){

                ans = mid;
                l = mid +1;
            }

            else{

                r= mid - 1;
            }




        }

        return ans;
    }


    public static int countTriplet(int A[], int mid){
        int count = 0;
        for(int i = 0; i < A.length; i++){

            int j = i + 1;
            int k = A.length -1;

            while(j < k){

                int sum = A[i] + A[j] + A[k];

                if(sum < mid){

                    count = count + (k - j);

                    j++;
                }

                else{
                    k--;
                }
            }


        }
        return count;
    }
}
