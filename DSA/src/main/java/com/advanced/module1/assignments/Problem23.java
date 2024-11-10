package com.advanced.module1.assignments;

/*

Q2. Tower of Hanoi
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
In the classic problem of the Towers of Hanoi, you have 3 towers numbered from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom) of different sizes which can slide onto any tower.
The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
You have the following constraints:

Only one disk can be moved at a time.
A disk is slid off the top of one tower onto another tower.
A disk cannot be placed on top of a smaller disk.
You have to find the solution to the Tower of Hanoi problem.
You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
In each row, there should be 3 integers (disk, start, end), where:

disk - number of the disk being moved
start - number of the tower from which the disk is being moved
end - number of the tower to which the disk is being moved


Problem Constraints
1 <= A <= 18


Input Format
The first argument is the integer A.


        Output Format
Return a 2D array with dimensions M x 3 as mentioned above in the description.


Example Input
Input 1:
A = 2
Input 2:

A = 3


Example Output
Output 1:
        [1 1 2 ] [2 1 3 ] [1 2 3 ]
Output 2:

        [1 1 3 ] [2 1 2 ] [1 3 2 ] [3 1 3 ] [1 2 1 ] [2 2 3 ] [1 1 3 ]


Example Explanation
Explanation 1:
We shift the first disk to the middle tower.
We shift the second disk to the last tower.
        We, finally, shift the first disk from the middle tower to the last tower.
Explanation 2:

We can see that this was the only unique path with minimal moves to move all disks from the first to the third tower.
*/

import java.util.ArrayList;
import java.util.List;

public class Problem23 {

    public int[][] towerOfHanoi(int A) {

        List<int[]> list = new ArrayList<>();

        move(A, 1, 2, 3, list);

        int res[][] = new int[list.size()][3];

        for(int i =0; i< list.size(); i++){

            res[i] = list.get(i);
        }

        return res;

    }

    public static void move(int n, int start, int helper, int dst, List<int[]> list){

        if(n == 0){

            return;
        }


        move(n-1, start, dst, helper, list);

        int[] arr = new int[3];
        arr[0] = n;
        arr[1] = start;
        arr[2] = dst;

        list.add(arr);

        move(n-1, helper, start, dst, list);



    }
}
