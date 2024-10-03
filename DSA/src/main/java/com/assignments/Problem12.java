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
import java.util.Arrays;
import java.util.List;

public class Problem12 {

    public static int[][] solve(int[] A) {
        // 2D ArrayList to store all subarrays
        List<List<Integer>>  subArray = new ArrayList<>();

        // Generate all subarrays
        for(int i = 0; i< A.length; i++){

            for(int j = i; j < A.length; j++){
                List< Integer> lst = new ArrayList<>();
                for(int k = i; k <=j; k++){
                    lst.add(A[k]);
                }
                subArray.add(lst);
            }
        }



        // Convert List<List<Integer>> to int[][]
        int res[][] = new int[subArray.size()][];

        for(int i = 0; i< subArray.size(); i++){
            List<Integer> lst = subArray.get(i);
            int arr[] = new int[lst.size()];
            for(int j = 0; j< lst.size(); j++){

                arr[j] = lst.get(j);
            }
            res[i] = arr;

        }
      return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(solve(new int[] {1,4,3,2,4,55,2,22,1})));
    }
}
