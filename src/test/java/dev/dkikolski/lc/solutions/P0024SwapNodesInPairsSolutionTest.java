package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.aux.ListNodes;
import dev.dkikolski.lc.structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.aux.ListNodes.makeLinkedList;
import static dev.dkikolski.lc.solutions.P0024SwapNodesInPairsSolution.swapPairs;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0024SwapNodesInPairsSolutionTest {
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(makeLinkedList(1, 2, 3, 4), makeLinkedList(2, 1, 4, 3)),
                arguments(makeLinkedList(1), makeLinkedList(1)),
                arguments(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode given, final ListNode expected) {
        assertThat(swapPairs(given))
                .usingComparator(ListNodes::compareLinkedListNodes)
                .isEqualTo(expected);
    }
}