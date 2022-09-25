package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0028FindTheIndexOfTheFirstOccurrenceInAStringSolution.strStr;
import static org.assertj.core.api.Assertions.assertThat;

class P0028FindTheIndexOfTheFirstOccurrenceInAStringSolutionTest {

    @SuppressWarnings("SpellCheckingInspection")
    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments("sadbutsad", "sad", 0),
                Arguments.arguments("leetcode", "leeto", -1),
                Arguments.arguments("arguments", "men", 4 ),
                Arguments.arguments("mississippi", "issip", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String haystack, final String needle, final int expected) {
        assertThat(strStr(haystack, needle)).isEqualTo(expected);
    }
}