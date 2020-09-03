import java.util.*;


class Solution {
    public int[] solve(int[] nums) {
        
        int[] result=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            int multiply=1;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                    continue;
                multiply*=nums[j];
            }
            result[i]=multiply;
                
        }
        return result;
    }
}


/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i. Do this without using division.

Note: The length of the array is guaranteed to be greater than 1.

Example 1
Input

nums = [1, 2, 3, 4, 5]
Output

[120, 60, 40, 30, 24]
Explanation

120 = 2 * 3 * 4 * 5, 60 = 1 * 3 * 4 * 5, and so on.

Example 2
Input

nums = [3, 2, 1]
Output

[2, 3, 6]*/