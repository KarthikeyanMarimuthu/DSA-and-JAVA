package com.advanced.module1.additional;

/*

Q3. SUBARRAY OR
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array of integers A of size N.

The value of a subarray is defined as BITWISE OR of all elements in it.

Return the sum of value of all subarrays of A % 109 + 7.



Problem Constraints
1 <= N <= 105

        1 <= A[i]    public int[] solve(int[] A) {

        // Getting XOR of all the values

        int xor = 0;

        for(int i= 0; i< A.length; i++){

            xor = xor ^ A[i];
        }

        for(int i =1; i<= A.length+2; i++){

            xor = xor ^ i;
        }

        int pos = -1;
        for(int i =0 ; i< 32; i++){

            if((xor & (1 << i)) > 0){

                pos = i;
                break;
            }
        }

        int a =0, b=0;




        for(int i = 1; i<=A.length+2; i++){

            if((i & (1 << pos)) >0){

                a = a^i;
            }

            else{

                b = b^i;
            }
        }

        for(int i = 0; i<A.length; i++){

            if((A[i] & (1 << pos)) >0){

                a = a^A[i];
            }

            else{

                b = b^A[i];
            }
        }




        int res [] = new int[2];

        res[0] = a;
        res[1] = b;

        Arrays.sort(res);

        return res;




    }<= 108



Input Format
The first argument given is the integer array A.



        Output Format
Return the sum of Value of all subarrays of A % 109 + 7.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [7, 8, 9, 10]


Example Output
Output 1:

        71
Output 2:

        110


Example Explanation
Explanation 1:

Value([1]) = 1
Value([1, 2]) = 3
Value([1, 2, 3]) = 3
Value([1, 2, 3, 4]) = 7
Value([1, 2, 3, 4, 5]) = 7
Value([2]) = 2
Value([2, 3]) = 3
Value([2, 3, 4]) = 7
Value([2, 3, 4, 5]) = 7
Value([3]) = 3
Value([3, 4]) = 7
Value([3, 4, 5]) = 7
Value([4]) = 4
Value([4, 5]) = 5
Value([5]) = 5
Sum of all these values = 71
Explanation 2:

Sum of value of all subarray is 110.
*/


public class Problem11 {

    public int solve(int[] A) {
        long res = 0;
        int mod = 1000000007;
        long total_length = ((long) A.length * (A.length + 1) / 2) % mod;

        for (int i = 0; i < 32; i++) {
            long total_zeros = 0;
            long continuous_zeros = 0;

            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) == 0) {
                    continuous_zeros++;
                } else {
                    total_zeros = (total_zeros + continuous_zeros * (continuous_zeros + 1) / 2) % mod;
                    continuous_zeros = 0;
                }
            }

            // Account for the continuous zeros at the end of the array
            total_zeros = (total_zeros + continuous_zeros * (continuous_zeros + 1) / 2) % mod;

            // Calculate the number of subarrays containing the i-th bit set
            long subarraysWithBitSet = (total_length - total_zeros + mod) % mod;
            res = (res + (subarraysWithBitSet * (1L << i) % mod)) % mod;
        }

        return (int) res;
    }
}
