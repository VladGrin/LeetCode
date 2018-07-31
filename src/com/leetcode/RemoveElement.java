package com.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        // nums is passed in by reference. (i.e., without making a copy)
        int len = removeElement(nums, val);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(len);
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}

//    int len = nums.length;
//        for (int i = 0; i < len; i++) {
//        if (nums[i] == val){
//        for (int j = i; j < len-1; j++) {
//        nums[j] = nums[j+1];
//        }
//        len--;
//        i--;
//        }
//        }
//        return len;
