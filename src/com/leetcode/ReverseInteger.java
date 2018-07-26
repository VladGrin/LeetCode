package com.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.reverse(5416516));
    }
}

class Solution1 {
    public int reverse(int x) {
        int ost;
        long rez = 0;
        while (x != 0) {
            ost = x % 10;
            rez = rez * 10 + ost;
            x /= 10;
        }
        if (rez != (int) rez) {
            return 0;
        }
        return (int) rez;
    }
}