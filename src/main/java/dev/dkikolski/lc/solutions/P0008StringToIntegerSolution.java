package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Medium;

@Medium
final class P0008StringToIntegerSolution {

    private P0008StringToIntegerSolution() {}

    public static int myAtoi(String s) {
        int sign = 1;
        int acc = 0;
        boolean numsParsed = false;
        boolean signParsed = false;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (numsParsed) {
                    return acc * sign;
                } else if (signParsed) {
                    return 0;
                }
                continue;
            }
            if ((c == '+' || c == '-') && !numsParsed) {
                if (signParsed) {
                    return 0;
                }
                signParsed = true;
                sign = c == '+' ? 1 : -1;
                continue;
            }
            if (c >= '0' && c <= '9') {
                numsParsed = true;
                int current = c - '0';
                if (acc == 0 && current == 0) {
                    continue;
                }
                if (acc * sign > Integer.MAX_VALUE/10 || (acc * sign == Integer.MAX_VALUE / 10 && current > 7)) return Integer.MAX_VALUE;
                if (acc * sign < Integer.MIN_VALUE/10 || (acc * sign == Integer.MIN_VALUE / 10 && current > 8)) return Integer.MIN_VALUE;
                acc = acc * 10 + current;
                continue;
            }
            if (numsParsed) {
                break;
            } else {
                return 0;
            }
        }
        return acc * sign;
    }
}
