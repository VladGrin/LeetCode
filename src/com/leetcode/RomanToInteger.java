package com.leetcode;

public class RomanToInteger {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.romanToInt("MDCXLVII"));
    }
}

class Solution4 {
    public int romanToInt(String s) {
        int rez = 0;
        int i = 0;
        while (s.length() != 0) {
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'M') {
                    if (i == 0) {
                        rez += 1000;
                        s = s.substring(1);
                        break;
                    }
                    if (i == 1) {
                        rez += 900;
                        s = s.substring(2);
                        break;
                    }
                }
                if (s.charAt(i) == 'D') {
                    if (i == 0) {
                        rez += 500;
                        s = s.substring(1);
                        break;
                    }
                    if (i == 1) {
                        rez += 400;
                        s = s.substring(2);
                        break;
                    }
                }
            }
            if (s.length() == i){
                break;
            }
        }
        while (s.length() != 0) {
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'C') {
                    if (i == 0) {
                        rez += 100;
                        s = s.substring(1);
                        break;
                    }
                    if (i == 1) {
                        rez += 90;
                        s = s.substring(2);
                        break;
                    }
                }
                if (s.charAt(i) == 'L') {
                    if (i == 0) {
                        rez += 50;
                        s = s.substring(1);
                        break;
                    }
                    if (i == 1) {
                        rez += 40;
                        s = s.substring(2);
                        break;
                    }
                }
            }
            if (s.length() == i){
                break;
            }
        }
        while (s.length() != 0) {
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'X') {
                    if (i == 0) {
                        rez += 10;
                        s = s.substring(1);
                        break;
                    }
                    if (i == 1) {
                        rez += 9;
                        s = s.substring(2);
                        break;
                    }
                }
                if (s.charAt(i) == 'V') {
                    if (i == 0) {
                        rez += 5;
                        s = s.substring(1);
                        break;
                    }
                    if (i == 1) {
                        rez += 4;
                        s = s.substring(2);
                        break;
                    }
                }
            }
            if (s.length() == i){
                break;
            }
        }
        while (s.length() != 0){
            for (i = 0; i < s.length(); i++){
                if (s.charAt(i) == 'I'){
                    rez += 1;
                    s = s.substring(1);
                    break;
                }
            }
        }
        return rez;
    }
}