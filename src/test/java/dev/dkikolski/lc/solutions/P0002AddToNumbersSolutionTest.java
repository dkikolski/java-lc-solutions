package dev.dkikolski.lc.solutions;


import dev.dkikolski.lc.aux.ListNodes;
import dev.dkikolski.lc.structures.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.aux.ListNodes.makeLinkedList;
import static dev.dkikolski.lc.solutions.P0002AddToNumbersSolution.addTwoNumbers;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0002AddToNumbersSolutionTest {

    public static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(makeLinkedList(2, 4, 3), makeLinkedList(5, 6, 4), makeLinkedList(7, 0, 8)),
                arguments(makeLinkedList(9, 9, 9, 9, 9, 9, 9), makeLinkedList(9, 9, 9, 9), makeLinkedList(8, 9, 9, 9, 0, 0, 0, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final ListNode a, final ListNode b, final ListNode expected) {
        assertThat(addTwoNumbers(a, b))
                .usingComparator(ListNodes::compareLinkedListNodes)
                .isEqualTo(expected);
    }
}