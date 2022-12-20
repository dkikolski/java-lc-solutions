package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.DynamicProgramming;
import dev.dkikolski.lc.tags.Medium;

import java.util.LinkedList;
import java.util.List;

@Medium
@DynamicProgramming
final class P0022GenerateParenthesesSolution {

    private P0022GenerateParenthesesSolution() {
    }

    public static List<String> generateParenthesis(int n) {
        final var acc = new LinkedList<String>();
        generateParenthesis(n - 1, n, "(", acc);
        return acc;
    }

    private static void generateParenthesis(final int lefts, final int rights, final String current, final List<String> acc) {
        if (lefts > 0) {
            generateParenthesis(lefts - 1, rights, current + "(", acc);
        }
        if (rights > lefts) {
            generateParenthesis(lefts, rights - 1, current + ")", acc);
        }
        if (lefts == 0 && rights == 0) {
            acc.add(current);
        }
    }
}
