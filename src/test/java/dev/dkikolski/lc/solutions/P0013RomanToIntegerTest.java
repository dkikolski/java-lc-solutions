package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0013RomanToInteger.romanToInt;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;


class P0013RomanToIntegerTest {

    @SuppressWarnings("SpellCheckingInspection")
    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("III", 3),
                arguments("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String given, final int expected) {
        assertThat(romanToInt(given)).isEqualTo(expected);
    }
}