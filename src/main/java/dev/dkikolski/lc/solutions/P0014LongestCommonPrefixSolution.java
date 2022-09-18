package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Easy;

@Easy
final class P0014LongestCommonPrefixSolution {

    private P0014LongestCommonPrefixSolution() {
    }

    public static String longestCommonPrefix(String[] strs) {
        String longest = strs[0];
        for (String s : strs) {
            while(!s.startsWith(longest)) {
                longest = longest.substring(0, longest.length() - 1);
            }
        }
        return longest;
    }
}
