package com.assignments;


/*Q4. Matrix Transpose
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given a 2D integer array A, return the transpose of A.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


Problem Constraints
1 <= A.size() <= 1000

        1 <= A[i].size() <= 1000

        1 <= A[i][j] <= 1000



Input Format
First argument is a 2D matrix of integers.



        Output Format
You have to return the Transpose of this 2D matrix.



        Example Input
Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
Input 2:

A = [[1, 2],[1, 2],[1, 2]]


Example Output
Output 1:

        [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Output 2:

        [[1, 1, 1], [2, 2, 2]]


Example Explanation
Explanation 1:

Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
Explanation 2:

After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]*/



public class Problem20 {

    public int[][] solve(int[][] A) {

        int N = A.length;
        int M = A[0].length;

        int res [][] = new int[M][N];

        for(int i = 0; i < N; i++){

            for(int j = 0 ; j < M; j++){
                res[j][i] = A[i][j];

            }
        }

        return res;
    }
}
