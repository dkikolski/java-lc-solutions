package dev.dkikolski.lc.solutions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0007ReverseIntegerSolution.reverse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0007ReverseIntegerSolutionTest {

    public static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(123, 321),
                arguments(-321, -123),
                arguments(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int given, final int expected) {
        assertThat(reverse(given)).isEqualTo(expected);
    }
}