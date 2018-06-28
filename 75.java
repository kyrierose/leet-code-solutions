/*
*   75. Sort Colors
*   https://leetcode.com/problems/sort-colors/description/
*   
*   Given an array with n objects colored red, white or blue, sort them in-place so that 
*   objects of the same color are adjacent, with the colors in the order red, white and blue.
*
*   Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue 
*   respectively.
*   Note: You are not suppose to use the library's sort function for this problem.
*
*/

class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=1;
        int lim=nums.length;
        if(lim == 0 || lim == 1) return;
        
        while(true){
            if(j == lim){
                i=0;j=1;lim--;
            }
            if(lim == 1)
                break;
            if(nums[i] > nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i++;j++;
        }
    }
}