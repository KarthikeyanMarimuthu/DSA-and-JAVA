package com.assignments;

import java.util.Arrays;

// Counting Noble Integer

public class Problem25 {

        public static int solve(int[] A) {

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

            int count = 0;
            boolean noble = false;

            if(A[0] == 0){
                count++;
                noble = true;
            }


            for( i = 1; i< A.length; i++){

                if(i == A[i] && A[i] != A[i-1]){

                    count++;
                    noble = true;

                }
                else if(A[i] == A[i-1] && noble){

                    count++;
                }
                else{
                    noble = false;
                }
            }
            return count;

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


    public static void main(String[] args) {

            System.out.println(solve(new int[] {6,5,4,3,3,3,3,3,3,}));

    }

    }
