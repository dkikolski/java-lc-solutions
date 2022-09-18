package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Medium;

import java.util.List;
@Medium
final class P0012IntegerToRomanSolution {

    private P0012IntegerToRomanSolution() {
    }

    private record Roman(String symbol, int value) {

    }

    private static final List<Roman> romans = List.of(
            new Roman("M", 1000),
            new Roman("CM", 900),
            new Roman("D", 500),
            new Roman("CD", 400),
            new Roman("C", 100),
            new Roman("XC", 90),
            new Roman("L", 50),
            new Roman("XL", 40),
            new Roman("X", 10),
            new Roman("IX", 9),
            new Roman("V", 5),
            new Roman("IV", 4),
            new Roman("I", 1)
    );

    public static String intToRoman(int num) {
        final var sb = new StringBuilder();
        while (num > 0) {
            for (Roman r : romans) {
                if (r.value <= num) {
                    num -= r.value;
                    sb.append(r.symbol);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
