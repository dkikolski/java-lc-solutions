package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Medium
final class P0015ThreeSumSolution {

    private P0015ThreeSumSolution() {
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        final var result = new LinkedList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int a = nums[i];
                int b = nums[left];
                int c = nums[right];
                int sum = a + b + c;

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(List.of(a, b, c));
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}
