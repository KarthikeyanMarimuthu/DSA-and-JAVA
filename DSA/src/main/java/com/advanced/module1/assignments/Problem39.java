package com.advanced.module1.assignments;

/*

Q2. Inversion count in an array
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 105

        1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



        Output Format
Return the number of inversions of A modulo (109 + 7).



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [3, 4, 1, 2]


Example Output
Output 1:

        1
Output 2:

        4


Example Explanation
Explanation 1:

The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
Explanation 2:

The pair (0, 2) is an inversion as 0 < 2 and A[0] > A[2]
The pair (0, 3) is an inversion as 0 < 3 and A[0] > A[3]
The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
The pair (1, 3) is an inversion as 1 < 3 and A[1] > A[3]

*/


public class Problem39 {


    public int solve(int[] A) {


        // Merge Sort;

        long ans = sort(A, 0, A.length-1);


        return (int) (ans % 1000000007);


    }

    public static long sort(int[] A, int left, int right){

        if(left == right){

            return 0;
        }

        int mid = (left + right) / 2;

        long r1 = sort(A, left, mid);
        long r2 = sort(A, mid+1, right);

        long r3 = merge(A, left, mid, right);

        return (r1 + r2 + r3) % 1000000007;

    }

    public static long merge(int[] A, int left, int mid, int right){

        long ans = 0;

        int n1 = mid - left + 1;
        int n2 = right - (mid + 1) +1;

        int B[] = new int[n1];

        int C[] = new int[n2];

        int k =0;
        for(int i = left; i<=mid; i++){

            B[k] = A[i];
            k++;
        }

        k = 0;
        for(int i = mid+1; i<=right; i++){

            C[k] = A[i];
            k++;
        }


        int b =0;
        int c =0;
        k =left;

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

                //ans
                // B =[1, 5, 7, 9, 11] , C =[2, 4, 6]

                // for 2 -> 5, 7, 9, 11
                // for 4 -> 5, 7, 9, 11
                // for 6 -> nothing

                ans = ans + (n1 - b);

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

        return ans;


    }
}
