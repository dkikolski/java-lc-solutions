package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Easy;

import java.util.HashMap;

@Easy
final class P0001TwoSumSolution {

    private P0001TwoSumSolution(){}

    public static int[] twoSum(final int[] nums, final int target) {
        final var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            final var diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
