/*
 * @lc app=leetcode id=912 lang=java
 *
 * [912] Sort an Array
 */
class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums, 0, nums.length-1);
    }

    private int[] mergesort(int[] nums, int l, int r) {
        if (l==r) {
            int[] res = new int[]{nums[l]};
            return res;
        }
        int mid = l + (r-l)/2;
        int[] lp = mergesort(nums, l, mid);
        int[] rp = mergesort(nums, mid+1, r);
        return merge(lp, rp);
    }

    private int[] merge(int[] lp, int[] rp) {
        int[] res = new int[lp.length+rp.length];
        int l = 0, r = 0;
        int i = 0;
        while (l<lp.length && r<rp.length) {
            if (lp[l] <= rp[r]) {
                res[i++] = lp[l];
                l++;
            } else {
                res[i++] = rp[r];
                r++;
            }
        }
        while (l<lp.length) {
            res[i++] = lp[l++];
        }
        while (r<rp.length) {
            res[i++] = rp[r++];
        }
        return res;
    }
}

