package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Medium;

@Medium
class P0028FindTheIndexOfTheFirstOccurrenceInAStringSolution {

    private P0028FindTheIndexOfTheFirstOccurrenceInAStringSolution() {
    }

    @SuppressWarnings("SpellCheckingInspection")
    public static int strStr(final String haystack, final String needle) {
        final var hlen = haystack.length();
        final var nlen = needle.length();
        var nchar = needle.charAt(0);

        for (int i = 0; i < hlen; i++) {
            // find next occurence of the first
            while (i < hlen && haystack.charAt(i) != nchar) {
                i++;
            }
            if (i < hlen) {
                var k = i + 1;
                var j = 1;
                while (k < hlen && j < nlen && haystack.charAt(k) == needle.charAt(j)) {
                    k++;
                    j++;
                }
                if (j == nlen) {
                    return k - j;
                }
            }
        }
        return -1;
    }
}
