package com.advanced.module2.assignments;

/*


Q4. Find a peak element
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of integers A, find and return the peak element in it.
An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.

        NOTE:

It is guaranteed that the array contains only a single peak element.
Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.


Problem Constraints
1 <= |A| <= 100000

        1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



        Output Format
Return the peak element.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [5, 17, 100, 11]


Example Output
Output 1:

        5
Output 2:

        100


Example Explanation
Explanation 1:

        5 is the peak.
        Explanation 2:

        100 is the peak.
*/



public class Problem4 {

    public int solve(int[] A) {
        int ans = 0;
        int l = 0;
        int r = A.length - 1;

        // Edge case: if there's only one element, return it
        if (A.length == 1) {
            return A[0];
        }

        while (l <= r) {
            int mid = (l + r)/ 2; // To avoid potential overflow

            // Check if mid is the peak element
            boolean isLeftGreater = (mid > 0) && (A[mid - 1] > A[mid]);
            boolean isRightGreater = (mid < A.length - 1) && (A[mid + 1] > A[mid]);

            if (!isLeftGreater && !isRightGreater) {
                // A[mid] is the peak
                return A[mid];
            } else if (isLeftGreater) {
                // Move towards the left half
                r = mid - 1;
            } else {
                // Move towards the right half
                l = mid + 1;
            }
        }

        return ans;

        // This line should never be reached if the input is valid, but just in case:

    }
}
