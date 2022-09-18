package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0009PalindromeNumberSolution.isPalindrome;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0009PalindromeNumberSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(121, true),
                arguments(-121, false),
                arguments(1221, true),
                arguments(123, false),
                arguments(0, true),
                arguments(10, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int given, final boolean expected) {
        assertThat(isPalindrome(given)).isEqualTo(expected);
    }
}