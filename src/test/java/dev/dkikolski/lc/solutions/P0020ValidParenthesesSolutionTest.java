package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static dev.dkikolski.lc.solutions.P0020ValidParenthesesSolution.isValid;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0020ValidParenthesesSolutionTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
            arguments("[]{}()", true),
            arguments("[{()}]", true),
            arguments("[]", true),
            arguments("{}", true),
            arguments("()", true),
            arguments("((()))[[[]]]{{{}}}{([])}", true),
            arguments("((()))[[[]]]{{{}}}{([)}", false),
            arguments("[)}", false),
            arguments("}", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String given, final boolean expected) {
        assertThat(isValid(given)).isEqualTo(expected);
    }
}