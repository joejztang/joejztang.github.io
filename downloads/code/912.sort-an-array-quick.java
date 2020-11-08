/*
 * @lc app=leetcode id=912 lang=java
 *
 * [912] Sort an Array
 */
class Solution {
    Random rm = new Random();
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length-1);
        return nums;
    }

    private int pivot(int[] nums, int p, int l, int r) {
        // swap pivot with rightmost element
        swap(nums, p, r);

        // undecided range is l to r-1
        int left = l, right = r-1;
        while (left <= right) {
            if (nums[left]<=nums[r]) {
                left++;
            } else if (nums[right]>nums[r]) {
                right--;
            } else {
                swap(nums, left, right);
                left++;
                right--;
            }
        }

        // swap right most with last position of left pointer
        swap(nums, left, r);
        return left;
    }

    private void quicksort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }

        int pIdx = l+ rm.nextInt(r-l+1);

        int pIdxAfter = pivot(nums, pIdx, l, r);

        quicksort(nums, l, pIdxAfter-1);
        quicksort(nums, pIdxAfter+1, r);
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}

