/*
 * @lc app=leetcode id=154 lang=java
 *
 * [154] Find Minimum in Rotated Sorted Array II
 */
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        while (l < r-1) {
            if (l < r-1) {
                if (l < r-1 && nums[l] == nums[l+1]) {
                    l++;
                    continue;
                } else if (nums[r] == nums[r-1]) {
                    r--;
                    continue;
                }
            }
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

