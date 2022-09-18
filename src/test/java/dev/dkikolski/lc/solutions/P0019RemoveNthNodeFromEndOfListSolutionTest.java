package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.aux.ListNodes;
import dev.dkikolski.lc.structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.aux.ListNodes.makeLinkedList;
import static dev.dkikolski.lc.solutions.P0019RemoveNthNodeFromEndOfListSolution.removeNthFromEnd;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0019RemoveNthNodeFromEndOfListSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(makeLinkedList(1, 2, 3), 1, makeLinkedList(1, 2)),
                arguments(makeLinkedList(1, 2, 3, 4, 5), 2, makeLinkedList(1, 2, 3, 5)),
                arguments(makeLinkedList(1,2), 1, makeLinkedList(1)),
                arguments(makeLinkedList(1), 1, null)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode given, final int n, final ListNode expected) {
        assertThat(removeNthFromEnd(given, n))
                .usingComparator(ListNodes::compareLinkedListNodes)
                .isEqualTo(expected);
    }
}