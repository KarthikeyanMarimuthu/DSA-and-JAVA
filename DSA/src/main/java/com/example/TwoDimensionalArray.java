package com.example;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {


        int A[][] = new int[][]{new int[]{1,2, 3}, new int[]{4 ,5 ,6}, new int[]{7 ,8 ,9}, new int[]{10,11,12}};



        // All Anti diagonals

        int N= A.length;
        int M = A[0].length;

        //Anti diagonal calculation

        int antidiagonals = N + M -1;

        // Result

        int res[][] = new int [antidiagonals][M];
        int p = 0, q = 0;



        int i = 0;

        for(int j =0; j < M; j++){

            int row = i, column = j;

            while( row < N && column>=0){

                System.out.print(A[row][column]+ " ");
                res[p][q] = A[row][column];
                row++;
                column--;

                q++;
            }
            System.out.println();
            p++;
            q = 0;
        }
        int j = M -1;
        for(i =1; i < N; i++){

            int row = i, column = j;

            while( row < N && column>=0){

                System.out.print(A[row][column]+ " ");
                res[p][q] = A[row][column];
                row++;
                column--;
                q++;
            }

            System.out.println();
            p++;
            q =0;
        }

        System.out.println(Arrays.deepToString(res));

    }
}
