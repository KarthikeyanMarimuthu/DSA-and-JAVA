package com.advanced.module2.additional;



/*

Q1. Allocate Books
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an array of integers A of size N and an integer B.

The College library has N books. The ith book has A[i] number of pages.

You have to allocate books to B number of students so that the maximum number of pages allocated to a student is minimum.

A book will be allocated to exactly one student.
Each student has to be allocated at least one book.
Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
Calculate and return that minimum possible number.

NOTE: Return -1 if a valid assignment is not possible.



Problem Constraints
1 <= N <= 105
        1 <= A[i], B <= 105



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return that minimum possible number.



        Example Input
Input 1:
A = [12, 34, 67, 90]
B = 2
Input 2:
A = [12, 15, 78]
B = 4


Example Output
Output 1:
        113
Output 2:
        -1


Example Explanation
Explanation 1:

There are two students. Books can be distributed in following fashion :
        1)  [12] and [34, 67, 90]
Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
2)  [12, 34] and [67, 90]
Max number of pages is allocated to student 2 with 67 + 90 = 157 pages
3)  [12, 34, 67] and [90]
Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
Of the 3 cases, Option 3 has the minimum pages = 113.
Explanation 2:
Each student has to be allocated at least one book.
But the Total number of books is less than the number of students.
Thus each student cannot be allocated to atleast one book.

Therefore, the result is -1.



*/




public class Problem8 {

    public int books(int[] A, int B) {
        // If the number of students is greater than the number of books
        if (B > A.length) {
            return -1; // Not enough books for each student
        }

        int low = 0;  // The minimum possible value for maximum pages
        int high = 0; // The maximum possible value for maximum pages

        // Calculate the sum of pages and the maximum number of pages
        for (int i = 0; i < A.length; i++) {
            low = Math.max(low, A[i]); // Each student needs at least one book
            high = high + A[i]; // Sum of all book pages
        }

        int ans = -1;
        // Binary search to find the minimum possible maximum number of pages
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if it is possible to distribute the books with 'mid' as the max pages per student
            boolean possible = canGive(A, B, mid);

            if (possible) {
                // If possible, try to reduce the maximum number of pages
                ans = mid;
                high = mid - 1;
            } else {
                // If not possible, increase the minimum pages
                low = mid + 1;
            }
        }
        return ans;
    }

    // Function to check if we can distribute books such that no student has more than 'pages' pages
    public static boolean canGive(int A[], int B, int pages) {
        int count = 1; // Start with the first student
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];

            // If adding this book exceeds the limit, assign it to the next student
            if (sum > pages) {
                count++;  // One more student
                sum = A[i]; // Start new sum with the current book

                // If more than B students are required, return false
                if (count > B) {
                    return false;
                }
            }
        }

        return true; // All books can be distributed within the limit
    }


}
