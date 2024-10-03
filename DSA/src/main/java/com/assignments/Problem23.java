package com.assignments;



/*Q2. Noble Integer
        Solved
        feature icon
        Using hints except Complete Solution is Penalty free now
        Use Hint
        Problem Description
        Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



        Problem Constraints
        1 <= |A| <= 2*105
        -108 <= A[i] <= 108


        Input Format
        First and only argument is an integer array A.



        Output Format
        Return 1 if any such integer p is present else, return -1.



        Example Input
        Input 1:

        A = [3, 2, 1, 3]
        Input 2:

        A = [1, 1, 3, 3]


        Example Output
        Output 1:

        1
        Output 2:

        -1*/

import java.util.Arrays;

public class Problem23 {

    public int solve(int[] A) {

      /*  1. Insertion sort
          2. Selection sort
          3. Bubble sort

          TC - > O(N^2)


        */

        /*
          1. Merge Sort
          2. Quick Sort


          TC - > O(N logN)


        */

        Arrays.sort(A); //Quick Sort --> Divide and Conquer




        int i = 0, j= A.length -1;

        while(i < j){

            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }

        //  insertionSort(A);

        // System.out.println(Arrays.toString(A));
        if(A[0] == 0){
            return 1;
        }


        for( i = 1; i< A.length; i++){

            if(i == A[i] && A[i] != A[i-1]){

                return 1;

            }
        }
        return -1;

    }


    static void insertionSort(int[] A){

        for(int i = 1; i< A.length ; i++){

            for(int j=i-1; j>=0; j--){

                if(A[j] < A[j+1]){

                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;

                }

                else{
                    break;
                }
            }
        }
    }

}
