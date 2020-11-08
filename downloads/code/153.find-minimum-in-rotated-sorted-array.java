/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;

        while (l < r-1) {
            int mid = l + (r-l)/2;
            if (nums[mid] > nums[l] && nums[mid] > nums[r]) {
                l = mid;
            } else if (nums[mid] < nums[l] && nums[mid] < nums[r]) {
                r = mid;
            } else {
                r = mid;
            }
        }
        return nums[l]<nums[r]? nums[l]: nums[r];
    }
}

