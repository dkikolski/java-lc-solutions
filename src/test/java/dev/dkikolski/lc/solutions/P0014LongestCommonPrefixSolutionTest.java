package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0014LongestCommonPrefixSolution.longestCommonPrefix;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@SuppressWarnings("SpellCheckingInspection")
class P0014LongestCommonPrefixSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(new String[]{"flower", "flow", "flight"}, "fl"),
                arguments(new String[]{"dog", "racecar", "car"}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String[] given, final String expected) {
        assertThat(longestCommonPrefix(given)).isEqualTo(expected);
    }
}