package com.advanced.module1.additional;
/*

Q5. Delete one
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.



Problem Constraints
2 <= N <= 105
        1 <= A[i] <= 109



Input Format
First argument is an integer array A.



        Output Format
Return an integer denoting the maximum value of GCD.



        Example Input
Input 1:

A = [12, 15, 18]
Input 2:

A = [5, 15, 30]


Example Output
Output 1:

        6
Output 2:

        15


Example Explanation
Explanation 1:

If you delete 12, gcd will be 3.
If you delete 15, gcd will be 6.
If you delete 18, gcd will 3.
Maximum value of gcd is 6.
Explanation 2:

If you delete 5, gcd will be 15.
If you delete 15, gcd will be 5.
If you delete 30, gcd will be 5.
Maximum value of gcd is 15.
*/


public class Problem23 {

    public int solve(int[] A) {
        int [] prefixGCD = getPrefixGCD(A);

        int [] suffixGCD = getSuffixGCD(A);

        int max_GCD = Integer.MIN_VALUE;
        int max_index = -1;

        for(int i =0 ; i< A.length; i++){


            int ans = 0;

            if(i == 0){

                ans = suffixGCD[i+1];

            }

            else if(i == A.length-1){

                ans = prefixGCD[i-1];

            }

            else{
                ans = getGCD(suffixGCD[i+1],prefixGCD[i-1]);

            }

            if(ans > max_GCD){

                max_GCD = ans;

            }
        }

        return max_GCD;

    }

    public static int getGCD(int A, int B){

        if(B == 0){

            return A;
        }

        return getGCD(B, A % B);
    }

    public static int[] getPrefixGCD(int [] A){

        int arr[] = new int[A.length];

        arr[0] = A[0];

        for(int i = 1; i< A.length; i++){

            arr[i] = getGCD(arr[i-1], A[i]);
        }

        return arr;
    }

    public static int[] getSuffixGCD(int [] A){

        int arr[] = new int[A.length];

        arr[A.length-1] = A[A.length-1];

        for(int i = A.length-2; i >= 0; i--){

            arr[i] = getGCD(arr[i+1], A[i]);
        }

        return arr;
    }
}
