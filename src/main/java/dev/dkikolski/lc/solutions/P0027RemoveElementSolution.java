package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Easy;

@Easy
@SuppressWarnings("SpellCheckingInspection")
final class P0027RemoveElementSolution {

    private P0027RemoveElementSolution() {
    }

    // with shifting valid elements to the begginging
    public static int removeElement(final int[] nums, final int val) {
        int icurrent = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[icurrent] = nums[i];
                icurrent++;
            }
        }
        return icurrent;
    }

    /*
    // with swapping elements
    public static int removeElement(final int[] nums, final int val) {
        int ibegin = 0;
        int iend = nums.length - 1;

        while (ibegin <= iend) {
            int currentVal = nums[ibegin];
            if (currentVal == val) {
                swap(nums, ibegin, iend);
                iend--;
            } else {
                ibegin++;
            }
        }
        return ibegin;
    }

    private static void swap(final int[] nums, final int ibegin, final int iend) {
        int temp = nums[ibegin];
        nums[ibegin] = nums[iend];
        nums[iend] = temp;
    }
    */
}
