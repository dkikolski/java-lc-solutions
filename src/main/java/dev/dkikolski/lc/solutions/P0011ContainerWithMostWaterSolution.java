package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Medium;

@Medium
final class P0011ContainerWithMostWaterSolution {

    private P0011ContainerWithMostWaterSolution() {}

    public static int maxArea(final int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            max = Math.max(max, minHeight * (r - l));
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
