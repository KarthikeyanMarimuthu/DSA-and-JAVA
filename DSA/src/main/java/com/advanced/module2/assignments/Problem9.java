package com.advanced.module2.assignments;




/*



Q2. Aggressive cows
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Farmer John has built a new long barn with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.

His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?



Problem Constraints
2 <= N <= 100000
        0 <= A[i] <= 109
        2 <= B <= N



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the largest minimum distance possible among the cows.



        Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

        2
Output 2:

        1


Example Explanation
Explanation 1:

John can assign the stalls at location 1, 3 and 5 to the 3 cows respectively. So the minimum distance will be 2.
Explanation 2:

The minimum distance will be 1.

*/


import java.util.Arrays;

public class Problem9 {


    public int solve(int[] A, int B) {


        Arrays.sort(A);

        int low = 1;

        int high = A[A.length-1];

        for(int i = 1; i< A.length ; i++){

            low = Math.min(low, A[i] - A[i - 1]);
        }

        int ans = 1;
        while (low <= high){

            int mid = low + (high - low) / 2;


            boolean possible = canPlace(A, B, mid);

            if(possible){
                ans = mid;
                low = mid + 1;
            }

            else{

                high = mid - 1;
            }
        }

        return ans;


    }


    public static boolean canPlace(int A[], int B, int av_didtance){


        int count = 1;

        int prev_placed = A[0];


        for(int i = 1; i< A.length; i++){

            int dist = A[i] - prev_placed;

            if(dist >= av_didtance){

                prev_placed = A[i];
                count ++;
            }


            if(count >= B){

                return true;
            }
        }
        return false;

    }
}
