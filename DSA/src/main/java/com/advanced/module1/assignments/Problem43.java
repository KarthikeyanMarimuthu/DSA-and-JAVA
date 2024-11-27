package com.advanced.module1.assignments;

/*


Q1. Largest Number
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints
1 <= len(A) <= 100000
        0 <= A[i] <= 2*109



Input Format
The first argument is an array of integers.



Output Format
Return a string representing the largest number.



        Example Input
Input 1:

A = [3, 30, 34, 5, 9]
Input 2:

A = [2, 3, 9, 0]


Example Output
Output 1:

        "9534330"
Output 2:

        "9320"


Example Explanation
Explanation 1:

Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
        Explanation 2:

Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem43 {
    public String largestNumber(int[] A) {

        List<Integer> list = new ArrayList<>();
        for (int num : A) {
            list.add(num);
        }

        // Sort the list using the custom comparator
        Collections.sort(list, new Compare());

        // Build the largest number from the sorted list
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
        }

        // Remove leading zeros (if any)
        String result = sb.toString();
        return result.charAt(0) == '0' ? "0" : result;
    }

    class Compare implements Comparator<Integer> {
        public int compare(Integer A, Integer B) {
            String a = A + "";
            String b = B + "";

            // Combine a + b and b + a to compare their lexicographical order
            String ab = a + b;
            String ba = b + a;

            // Compare the two combined strings
            return ba.compareTo(ab);  // Reverse order to get largest number
        }
    }
}


