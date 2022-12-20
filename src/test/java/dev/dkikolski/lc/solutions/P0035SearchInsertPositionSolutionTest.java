package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class P0035SearchInsertPositionSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(new int[]{1,3,5,6}, 5, 2),
                Arguments.arguments(new int[]{1,3,5,6}, 2, 1),
                Arguments.arguments(new int[]{1,3,5,6}, 7, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int target, final int expectedIndex) {
        assertThat(P0035SearchInsertPositionSolution.searchInsert(nums, target)).isEqualTo(expectedIndex);
    }
}