package com.additionalProblems;


/*
Q5. Count of primes
        Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.


        Problem Constraints
0 <= n <= 10^3


Input Format
Single input parameter n in function.


Output Format
Return the count of prime numbers less than or equal to n.


Example Input
Input 1:
        19
Input 2:
        1


Example Output
Output 1:
        8
Output 2:
        0


Example Explanation
Explanation 1:
Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
Explanation 2:
There are no primes <= 1



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: A single Integer, For e.g 9*/

public class Problem2 {

    public int solve(int A) {

        int count = 0;

        for(int i = 2; i<=A; i++){

            if(isPrime(i)){
                count ++;
            }
        }
        return count;
    }

    public static boolean isPrime(int A){
        int count = 0;
        for(int i = 1 ; i*i <= A; i++){

            if(A%i==0){
                if(i==A/i){
                    count++;
                }
                else{
                    count+=2;

                }
                if(count > 2){
                    return false;
                }
            }
        }
        return true;

    }
}
