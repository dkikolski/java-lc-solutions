package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0011ContainerWithMostWaterSolution.maxArea;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0011ContainerWithMostWaterSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                arguments(new int[]{1, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] given, final int expected) {
        assertThat(maxArea(given)).isEqualTo(expected);
    }
}