package com.assignments;


/*Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


        Input Format

The only argument given is string A.
        Output Format

Return the length of the longest consecutive 1’s that can be achieved.
        Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
A = "111000"
Output 1:
        3

Input 2:
A = "111011101"
Output 2:
        7*/

public class Problem31 {

    public int solve(String A) {

        char arr[] = A.toCharArray();

        //Base condition
        int total_count = 0;
        for(int i = 0; i< arr.length; i++){

            if(arr[i]=='1'){
                total_count++;
            }
        }

        if(total_count == arr.length){
            return total_count;
        }

        int ans = 0;

        for(int i = 0 ; i< arr.length; i++){

            if(arr[i]=='0'){

                int l =0, r=0;



                // for right side
                int j= i+1;
                // 1st write j condition , we may get array out of bound exception
                while(j<arr.length && arr[j]=='1'){

                    r++;
                    j++;
                }

                // for left side
                j = i -1;
                // 1st write j condition , we may get array out of bound exception
                while(j>=0 && arr[j]=='1'){

                    l++;
                    j--;

                }

                if(l+r == total_count){

                    ans = Math.max(ans, l+r);
                }
                else{
                    ans = Math.max(ans, l+r+1);
                }

            }



        }

        return ans;

    }
}
