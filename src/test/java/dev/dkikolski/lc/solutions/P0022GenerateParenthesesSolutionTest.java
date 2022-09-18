package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0022GenerateParenthesesSolution.generateParenthesis;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0022GenerateParenthesesSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(1, List.of("()")),
                arguments(3, List.of("((()))", "(()())", "(())()", "()(())", "()()()"))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int given, final List<String> output) {
        assertThat(generateParenthesis(given)).containsExactlyElementsOf(output);
    }
}