package com.assignments;


/*
Q4. Special Index
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Problem Constraints
1 <= N <= 105
        -105 <= A[i] <= 105
Sum of all elements of A <= 109


Input Format
First argument contains an array A of integers of size N


Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input
Input 1:
A = [2, 1, 6, 4]
Input 2:

A = [1, 1, 1]


Example Output
Output 1:
        1
Output 2:

        3


Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
Therefore, the required output is 1.
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Therefore, the required output is 3.
*/


public class Problem9 {

    public int solve(int[] arr) {

        int [] Even_Array = new int[arr.length];

        int [] Odd_Array = new int[arr.length];

        Even_Array = evenPrefixSum(arr);
        Odd_Array = oddPrefixSum(arr);
        int count =0;
        for(int i =0; i < arr.length; i++){
            int even_sum = 0;
            int odd_sum = 0;
            if(i==0){
                even_sum = Odd_Array[arr.length -1] - Odd_Array[i] ;
                odd_sum = Even_Array[arr.length -1] - Even_Array[i] ;
            }

            else{

                // If i index is removed the the index in the left to i always remains same  but right will change to Even->odd and Odd->Even
                even_sum = Even_Array[i-1] + (Odd_Array[arr.length-1] - Odd_Array[i]);
                odd_sum = Odd_Array[i -1] + (Even_Array[arr.length-1]- Even_Array[i]);
            }

            if(even_sum == odd_sum){
                count +=1;
            }
        }
        return count;

    }

    public static int[] evenPrefixSum(int arr[]){

        int [] Even_Array = new int[arr.length];
        Even_Array[0] = arr[0];

        // For Even array 1st element will be same as Orginal array's 1 st index
        for(int i =1; i< arr.length; i++){

            if(i%2==0){
                Even_Array[i] = Even_Array[i-1] + arr[i];
            }
            else{
                Even_Array[i] = Even_Array[i-1];
            }
        }

        return Even_Array;

    }

    public static int[] oddPrefixSum(int arr[]){

        int [] Odd_Array = new int[arr.length];

        // For odd array 1st element will be 0
        Odd_Array[0] = 0;

        for(int i =1; i< arr.length; i++){

            if(i%2!=0){
                Odd_Array[i] = Odd_Array[i-1] + arr[i];
            }
            else{
                Odd_Array[i] = Odd_Array[i-1];
            }
        }

        return Odd_Array;

    }
}
