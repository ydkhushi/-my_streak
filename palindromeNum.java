//https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int value) {
    int output = 0;
    int originalInput = value;
        while (value > 0) {
            int remainder = value % 10;
            output = output * 10 + remainder;
            value = value/10;
        }
        return output == originalInput;
    }
}