/*
*   389. Find the Difference
*
*   https://leetcode.com/problems/find-the-difference/description/
*   
*   Given two strings s and t which consist of only lowercase letters.
*   String t is generated by random shuffling string s and then add one 
*   more letter at a random position.Find the letter that was added in t.
*
*/

import java.util.*;
class Solution {
    
    public char findTheDifference(String s, String t) {
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);
        while(s1.length() != 0){
            int x = s1.indexOf(String.valueOf(t1.charAt(0)));
            if(x >= 0){
                s1.deleteCharAt(x);
                t1.deleteCharAt(0);
            }else{
                return t1.charAt(0);
            }
        }
        return t1.charAt(0);
    }

    public char findTheDifferenceEfficient(String s, String t){
        //Logic is simple convert to ascii and add t string code and subtract s string code.
        int ascii_sum = (int)t.charAt(t.length()-1);
        for(int i=0;i<s.length();i++){
            ascii_sum -= (int)s.charAt(i);
            ascii_sum += (int)t.charAt(i);
        }
        return (char)ascii_sum;
    }

    public static void main(String []args){
        System.out.println(findTheDifferenceEfficient("abc","abcz"));
    }
}


