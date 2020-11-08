/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        // assume
        // [0, i] are numbers that already dedup
        // j is current pointer
        if (nums.length <= 1) return nums.length;
        int i = 0, j = 0;
        while (j<nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

