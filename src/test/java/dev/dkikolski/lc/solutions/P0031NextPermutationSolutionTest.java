package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0031NextPermutationSolution.nextPermutation;
import static org.assertj.core.api.Assertions.assertThat;

class P0031NextPermutationSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3}, new int[]{1, 3, 2}),
                Arguments.arguments(new int[]{2, 3, 1}, new int[]{3, 1, 2}),
                Arguments.arguments(new int[]{3, 2, 1}, new int[]{1, 2, 3}),
                Arguments.arguments(new int[]{5, 1, 1}, new int[]{1, 1, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] given, final int[] expected) {
        nextPermutation(given); // Replacement in place
        assertThat(Arrays.equals(given, expected)).isTrue();
    }
}