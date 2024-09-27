package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pointer {

    public static void main(String[] args) {
        System.out.println(Solution.solve(new int[]{6,3,3,6,7,8,7,3,7},1,2));
        System.out.println(Solution2.solve("AGGGAEGGG"));
        System.out.println(Solution2.solve1(new int[]{814,761,697,483,981}));
        System.out.println(Arrays.deepToString(Solution2.subArray(new int[]{6,3,3,6,7,8,7,3,7})));

    }
    public class Solution {
        public static int[] solve(int[] A, int B, int C) {

            int[] res = new int[(C-B)+1];

            for(int i = B ; i<=C; i++){

                res[i-B] = A[i];
            }

            return res;
        }

    }

    public class Solution2 {
        public static long solve(String A) {


            //Carry forward
            int[] carry_forward = new int[A.length()];
            int count = 0;
            for(int i = 0 ; i < A.length(); i++){

                if(A.charAt(i)=='A'){
                    count +=1;
                }
                carry_forward[i] = count;
            }
            long res = 0;
            long E_count = 0;
            for(int i = 0 ; i < A.length(); i++){
                if(A.charAt(i)=='E'){
                    E_count +=carry_forward[i];
                }
                else if(A.charAt(i)=='G'){
                    res +=E_count;
                }
            }

            return res;


        }



        public static int solve1(int[] A) {

            //Sliding window

            int min_value = Integer.MAX_VALUE;
            int max_value = Integer.MIN_VALUE;

            for(int i = 0; i< A.length; i++){
                if(A[i] > max_value){
                    max_value = A[i];
                }

                if(A[i] < min_value){
                    min_value = A[i];
                }
            }

            int min_ptr = -1;
            int max_ptr = -1;
            int size = Integer.MAX_VALUE;
            for(int i = 0; i < A.length; i++){

                if(A[i] == max_value){
                    min_ptr = i;
                }
                if(A[i] == min_value){
                    max_ptr = i;
                }

                if(min_ptr!=-1 && max_ptr!=-1){
                    size = Math.min(size,Math.abs(max_ptr - min_ptr));

                }
                if(size==2){
                    break;
                }

            }

            return size;
        }

        public static int[][] subArray(int[] A) {

            List<int[]> subbarrays = new ArrayList<>();

            for(int i = 0 ; i< A.length; i++){

                for(int j = i ; j < A.length; j++){

                    int arr[] = new int[j-i+1];

                    for(int k =0 ; k< arr.length; k++){

                        arr[k] = A[i+k];
                    }
                    subbarrays.add(arr);
                }
            }
            System.out.println(subbarrays);
            int res[][] = new int[subbarrays.size()][];
            for(int i = 0; i < subbarrays.size(); i++){

                res[i] = subbarrays.get(i);
            }

            return res;


        }
    }


}
