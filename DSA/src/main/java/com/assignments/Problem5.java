package com.assignments;

/*
Problem Description
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.


        Problem Constraints
1 <= N <= 105
        1 <= A[i] <=109
        1 <= B <= 109


Input Format
The first argument given is the integer array A.
The second argument given is the integer B.


Output Format
Return the array A after rotating it B times to the right


Example Input
Input 1:

A = [1, 2, 3, 4]
B = 2
Input 2:

A = [2, 5, 6]
B = 1


Example Output
Output 1:

        [3, 4, 1, 2]
Output 2:

        [6, 2, 5]


Example Explanation
Explanation 1:

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
Explanation 2:

Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]
*/

public class Problem5 {



    /*
    Steps

    1. Update K by K % Arr.length
    2. Check the corner case K==0 || Arr.length ==1
    3. Reverse entire array
    4. Reverse from 0 to K-1 index
    5. Reverse from K to Arr.length-1*/

    public int[] solve(int[] A, int B) {
        B = B % A.length;
        if(B == 0 || A.length==1){
            return A;
        }
        reverse(A, 0, A.length-1);
        reverse(A, 0, B-1);
        reverse(A, B, A.length-1);

        return A;

    }

    public static void reverse(int[] A, int i, int j){

        while( i < j){

            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }


    }



}
