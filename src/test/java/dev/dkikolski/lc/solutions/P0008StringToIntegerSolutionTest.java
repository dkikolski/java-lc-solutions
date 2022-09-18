package dev.dkikolski.lc.solutions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.lc.solutions.P0008StringToIntegerSolution.myAtoi;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@SuppressWarnings("SpellCheckingInspection")
class P0008StringToIntegerSolutionTest {

    public static Stream<Arguments> testcases() {
        return Stream.of(
                arguments("-42", -42),
                arguments("42", 42),
                arguments("-13+8", -13),
                arguments("0 0 0 -13", 0),
                arguments("000-13", 0),
                arguments("    -88827   5655  U",  -88827),
                arguments("  +  413", 0),
                arguments("           +++42", 0),
                arguments("           -53", -53),
                arguments("           -53xyz", -53),
                arguments("+64xyzs422234", 64),
                arguments("+-+._", 0),
                arguments("    0000075", 75),
                arguments("    00000-75", 0),
                arguments("-123454789009876554212345678990098765432", Integer.MIN_VALUE),
                arguments("123454789009876554212345678990098765432", Integer.MAX_VALUE),
                arguments("-2147483649", -2147483648)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final String given, final int expected) {
        assertThat(myAtoi(given)).isEqualTo(expected);
    }
}