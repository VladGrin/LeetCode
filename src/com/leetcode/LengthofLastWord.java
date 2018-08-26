package com.leetcode;

import java.util.Scanner;

public class LengthofLastWord {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String string = scanner.nextLine();
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.lengthOfLastWord(string));
    }
}
class Solution8 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int len = arr.length;
        if (len == 0){
            return 0;
        }
        return arr[len-1].length();
    }
}