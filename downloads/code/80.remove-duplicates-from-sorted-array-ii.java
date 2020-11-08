/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        // assume [0,left] are nums to keep
        // right is current pointer
        int left = 0, right = 0;
        int cnt = 0;
        while (right < nums.length) {
            if (nums[left] == nums[right]) {
                cnt++;
                right++;
            } else {
                left++;
                if (cnt >= 2) {// see if there are multiple sames. if multiple greater than 2, keep one more current nums.
                    left++;
                }
                nums[left] = nums[right];
                if (left>=2&&cnt >=2) {
                    nums[left-1] = nums[left-2];
                }
                cnt = 0;
            }
        }

        if (cnt >= 2) {
            left++;
            nums[left] = nums[right-1];
        }

        return left+1;
    }
}

