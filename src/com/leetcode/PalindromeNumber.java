package com.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isPalindrome(23321));
    }
}
//class Solution2 {
//    public boolean isPalindrome(int x) {
//        String string = Integer.toString(x);
//        StringBuilder stringBuilder = new StringBuilder(string);
//        stringBuilder.reverse();
//        return string.equals(stringBuilder.toString());
//    }
//}

class Solution2 {
    public boolean isPalindrome(int x) {
        int rez = 0;
        int num = x;
        while (num != 0) {
            rez = rez * 10 + num % 10;
            num /= 10;
        }
        if ( x != rez || x < 0) {
            return false;
        }
        return true;
    }
}