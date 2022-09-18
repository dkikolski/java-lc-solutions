package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0012IntegerToRomanSolution.intToRoman;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@SuppressWarnings("SpellCheckingInspection")
class P0012IntegerToRomanSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(3, "III"),
                arguments(20, "XX"),
                arguments(58, "LVIII"),
                arguments(1994, "MCMXCIV")
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int given, final String expected) {
        assertThat(intToRoman(given)).isEqualTo(expected);
    }
}