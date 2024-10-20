package com.assignments;


/*
Q3. Rain Water Trapped
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.

        Example:

The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.


Rain Water Trapped




Problem Constraints
1 <= |A| <= 105
        0 <= A[i] <= 105



Input Format
First and only argument is the Integer Array, A.



Output Format
Return an Integer, denoting the total amount of water that can be trapped in these valleys



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

        1
Output 2:

        0


Example Explanation
Explanation 1:

        1 unit is trapped on top of the 3rd element.
Rain Water Histogram
Explanation 2:

No water is trapped.
*/


public class Problem36 {


    public int trap(final int[] A) {


        int left_max[] = leftMax(A);
        int right_max[] = rightMax(A);

        int water = 0;
        for(int i =1; i<A.length-1; i++){

            int count = (Math.min(left_max[i-1],right_max[i+1]) - A[i]);

            if(count > 0){
                water = water + count;
            }

        }
        return water;

    }

    public static int[] leftMax(int[] A){

        int left_max[] = new int[A.length];

        int max = A[0];
        left_max[0] = max;

        for(int i=1; i<A.length; i++){

            if(A[i] > max){

                max = A[i];
            }

            left_max[i] = max;
        }

        return left_max;
    }

    public static int[] rightMax(int[] A){

        int right_max[] = new int[A.length];

        int max = A[A.length-1];
        right_max[A.length-1] = max;

        for(int i=A.length-2; i >=0; i--){

            if(A[i] > max){

                max = A[i];
            }

            right_max[i] = max;
        }

        return right_max;

    }
}
