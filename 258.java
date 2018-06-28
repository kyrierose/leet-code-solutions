/*
*   258. Add Digits
*   https://leetcode.com/problems/add-digits/description/
*   
*   Given a non-negative integer num, repeatedly add all its digits until the result has only one digit. 
*
*/

import java.util.*;
class Solution {
    
    public static void main(String [] args){
        System.out.println(addDigits(213));
    }
    
    public static int addDigits(int num) {
        if(num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
}