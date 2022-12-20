package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Easy;

@Easy
public class P0013RomanToInteger {

    private P0013RomanToInteger() {
    }

    public static int romanToInt(final String s) {
        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            final var current = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            result += current < prev ? current * -1 : current;
            prev = current;
        }
        return result;
    }
}
