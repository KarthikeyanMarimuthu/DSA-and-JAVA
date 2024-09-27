package com.assignments;


/*Q5. Generate all subarrays
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.


Problem Constraints
1 <= N <= 100
        1 <= A[i] <= 105


Input Format
First argument A is an array of integers.


Output Format
Return a 2D array of integers in any order.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [5, 2, 1, 4]


Example Output
Output 1:
        [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
Output 2:
        [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]


Example Explanation
For Input 1:
All the subarrays of the array are returned. There are a total of 6 subarrays.
For Input 2:
All the subarrays of the array are returned. There are a total of 10 subarrays.*/

import java.util.ArrayList;
import java.util.List;

public class Problem12 {

    public int[][] solve(int[] A) {
        // 2D ArrayList to store all subarrays
        List<List<Integer>> subarrays = new ArrayList<>();

        // Generate all subarrays
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                List<Integer> arr = new ArrayList<>(); // Using List to build subarrays
                for (int k = i; k <= j; k++) {
                    arr.add(A[k]); // Add elements to the list
                }
                subarrays.add(arr); // Add the subarray list to the 2D ArrayList
            }
        }

        // Convert List<List<Integer>> to int[][]
        int[][] res = new int[subarrays.size()][];
        for (int i = 0; i < subarrays.size(); i++) {
            List<Integer> list = subarrays.get(i);
            res[i] = new int[list.size()]; // Create a new array of the correct size
            for (int j = 0; j < list.size(); j++) {
                res[i][j] = list.get(j); // Populate the array
            }
        }

        return res;
    }
}
