/*
*   35. Search Insert Position
*   https://leetcode.com/problems/search-insert-position/description/
*   
*   Given a sorted array and a target value, return the index if the target is found. 
*   If not, return the index where it would be if it were inserted in order.
*   You may assume no duplicates in the array.
*
*/

import java.util.*;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length -1, mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return high < low ? low: high;  
    }

    public static void main(String []args){
        System.out.println(searchInsert(new int[]{1,4,6,8}, 5));
    }
}