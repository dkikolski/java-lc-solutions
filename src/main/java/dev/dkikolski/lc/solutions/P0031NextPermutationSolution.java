package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Medium;

@Medium
public class P0031NextPermutationSolution {
    public static void nextPermutation(final int[] nums) {
        final int len = nums.length;
        int i = len - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private static void swap(final int[] a, final int i, final int j) {
        final var t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void reverse(final int[] a, final int start) {
        int i = start;
        int j = a.length - 1;
        while(i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }
}

