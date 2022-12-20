package dev.dkikolski.lc.solutions;

public class P0035SearchInsertPositionSolution {
    public static int searchInsert(final int[] nums, final int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // avoid overflow when 'low' and 'high' are very big
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }
}
