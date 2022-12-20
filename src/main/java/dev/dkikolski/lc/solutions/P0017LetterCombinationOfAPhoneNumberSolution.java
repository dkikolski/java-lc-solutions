package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.DynamicProgramming;
import dev.dkikolski.lc.tags.Medium;

import java.util.*;
import java.util.stream.Collectors;

@Medium
@DynamicProgramming
final class P0017LetterCombinationOfAPhoneNumberSolution {

    private P0017LetterCombinationOfAPhoneNumberSolution() {
    }

    static final Map<Character, List<Character>> mapping;

    static {
        mapping = Map.of(
                '2', List.of('a', 'b', 'c'),
                '3', List.of('d', 'e', 'f'),
                '4', List.of('g', 'h', 'i'),
                '5', List.of('j', 'k', 'l'),
                '6', List.of('m', 'n', 'o'),
                '7', List.of('p', 'q', 'r', 's'),
                '8', List.of('t', 'u', 'v'),
                '9', List.of('w', 'x', 'y', 'z')
        );
    }

    public static List<String> letterCombinations(String digits) {
        final var acc = new LinkedList<String>();
        letterCombinations(digits, "", acc);
        return acc;
    }

    private static void letterCombinations(final String digits, final String current, final List<String> acc) {
        if (digits.isEmpty()) {
            if (!current.isEmpty()) {
                acc.add(current);
            }
            return;
        }
        final var head = digits.charAt(0);
        final var characters = mapping.get(head);
        for (final var c : characters) {
            letterCombinations(digits.substring(1), current + c, acc);
        }
    }
}
