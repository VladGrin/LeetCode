package com.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(solution.twoSum(array, 16)[0]);
        System.out.println(solution.twoSum(array, 16)[1]);

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}



