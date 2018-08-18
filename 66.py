"""

66. Plus One

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

"""

class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        length = len(digits)
        for x in range(length-1, -1, -1):
            if digits[x] == 9 and x == 0:
                digits[x] = 0
                digits.insert(0, 1)
                break
            if digits[x] == 9:
                digits[x] = 0
                continue
            else:
                digits[x] += 1
                break
                
        return digits
            