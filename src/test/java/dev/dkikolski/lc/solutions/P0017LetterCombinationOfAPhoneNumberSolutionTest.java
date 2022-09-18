package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0017LetterCombinationOfAPhoneNumberSolution.letterCombinations;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0017LetterCombinationOfAPhoneNumberSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("", Collections.emptyList()),
                arguments("2", List.of("a", "b", "c")),
                arguments("23", Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String given, final List<String> expected) {
        assertThat(letterCombinations(given)).containsExactlyElementsOf(expected);
    }
}