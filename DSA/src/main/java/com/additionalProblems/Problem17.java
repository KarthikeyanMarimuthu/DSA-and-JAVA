package com.additionalProblems;


/*Q4. Row Sum
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Constraints
1 <= A.size() <= 103

        1 <= A[i].size() <= 103

        1 <= A[i][j] <= 103



Input Format
First argument A is a 2D array of integers.(2D matrix).



Output Format
Return an array containing row-wise sums of original matrix.



        Example Input
Input 1:

        [1,2,3,4]
        [5,6,7,8]
        [9,2,3,4]


Example Output
Output 1:

        [10,26,18]


Example Explanation
Explanation 1

Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18*/

public class Problem17 {

    public int[] solve(int[][] A) {


        int N = A.length;
        int M = A[0].length;
        int res[] = new int[N];

        for(int i = 0; i< N ; i++){

            int sum = 0;
            for(int j =0 ; j< M ; j++){
                sum = sum + A[i][j];

            }

            res[i] = sum;
        }

        return res;
    }


}
