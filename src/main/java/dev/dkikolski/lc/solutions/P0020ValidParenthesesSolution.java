package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Easy;

import java.util.LinkedList;

@Easy
final class P0020ValidParenthesesSolution {

    private P0020ValidParenthesesSolution() {
    }

    public static boolean isValid(String s) {
        final var queue = new LinkedList<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                queue.addFirst(')');
            } else if( c == '[') {
                queue.addFirst(']');
            } else if (c == '{') {
                queue.addFirst('}');
            } else if (queue.isEmpty() || queue.pop() != c) {
                return false;
            }
        }
        return queue.isEmpty();
    }

}
