package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Medium;

@Medium
final class P0007ReverseIntegerSolution {

    private P0007ReverseIntegerSolution(){}
    public static int reverse(final int x) {
        final int sign = x < 0 ? -1 : 1;
        int current = Math.abs(x);
        int acc = 0;

        while (current > 0) {
            var pop = current % 10;
            if (acc > Integer.MAX_VALUE/10 || (acc == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (acc < Integer.MIN_VALUE/10 || (acc == Integer.MIN_VALUE / 10 && pop < 8)) return 0;
            acc = acc * 10 + pop;
            current /= 10;
        }

        return acc * sign;
    }
}
