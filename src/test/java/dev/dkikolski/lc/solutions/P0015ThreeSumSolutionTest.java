package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0015ThreeSumSolution.threeSum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0015ThreeSumSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                arguments(new int[]{0, 1, 1}, Collections.emptyList()),
                arguments(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0)))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] given, final List<List<Integer>> expected) {
        assertThat(threeSum(given)).satisfies(expectedTriplets(expected));
    }

    private Consumer<? super List<? extends List<Integer>>> expectedTriplets(final List<List<Integer>> expected) {
        return actual -> {
            for (int i = 0; i < actual.size(); i++) {
                assertThat(actual.get(i)).containsExactly(expected.get(i).toArray(new Integer[3]));
            }
        };
    }
}