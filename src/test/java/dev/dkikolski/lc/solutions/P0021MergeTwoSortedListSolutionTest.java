package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.aux.ListNodes;
import dev.dkikolski.lc.structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.aux.ListNodes.makeLinkedList;
import static dev.dkikolski.lc.solutions.P0021MergeTwoSortedListSolution.mergeTwoLists;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0021MergeTwoSortedListSolutionTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(null, makeLinkedList(1), makeLinkedList(1)),
                arguments(makeLinkedList(1, 2), null, makeLinkedList(1, 2)),
                arguments(makeLinkedList(1, 2, 4), makeLinkedList(1, 3, 4), makeLinkedList(1, 1, 2, 3, 4, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode givenHeadA, final ListNode givenHeadB, final ListNode expectedHead) {
        assertThat(mergeTwoLists(givenHeadA, givenHeadB))
                .usingComparator(ListNodes::compareLinkedListNodes)
                .isEqualTo(expectedHead);
    }
}