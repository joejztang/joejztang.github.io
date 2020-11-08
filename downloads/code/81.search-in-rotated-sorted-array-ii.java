/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */
class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while (l<=r) {
            if (l<r) {
                if (nums[l] == nums[l+1]) {
                    l++;
                    continue;
                } else if (nums[r] == nums[r-1]) {
                    r--;
                    continue;
                } else if (nums[l] == nums[r]) {
                    l++;
                    continue;
                }
            }
            int mid = l +(r-l)/2;
            if (nums[mid] == target) return true;
            else if (nums[mid] < nums[r]) {
                if (nums[mid] < target && target <= nums[r]) l = mid+1;
                else r = mid-1;
            } else { // nums[mid] > nums[r]
                if (nums[l] <= target && target < nums[mid]) r = mid-1;
                else l = mid+1;
            }
        }
        return false;
    }
}

