package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0027RemoveElementSolution.removeElement;
import static org.assertj.core.api.Assertions.assertThat;

class P0027RemoveElementSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 2, 3}, new int[]{1, 3}, 2, 2),
                Arguments.arguments(new int[]{1, 1, 1}, new int[]{}, 1, 0),
                Arguments.arguments(new int[]{1, 2, 3, 4, 4, 4, 5}, new int[]{1, 2, 3, 5}, 4, 4),
                Arguments.arguments(new int[]{1, 2, 3, 4, 4, 4, 5, 4, 5, 4, 5}, new int[]{2, 3, 4, 4, 4, 5, 4, 5, 4}, 1, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final int[] expectedNumsFirstElements, final int target, final int expectedLen) {
        final var actualLen = removeElement(nums, target);
        assertThat(actualLen).isEqualTo(expectedLen);
        assertThat(Arrays.copyOfRange(nums, 0, expectedLen)).startsWith(expectedNumsFirstElements);
    }
}