package ru.snm.interview;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.snm.interview.Task4.Days;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sine-loco
 */
class Task4Test {

    private final Task4 subject = new Task4();

    @ParameterizedTest
    @MethodSource( "forSolution" )
    void solution(String day, int k, String expected) {
        // when
        String actual = subject.solution( day, k );

        // then
        assertEquals( expected, actual );
    }

    static Stream<Arguments> forSolution() {
        return Stream.of(
                Arguments.of( Days.MON.day, 1, Days.TUE.day ),
                Arguments.of( Days.MON.day, 2, Days.WED.day ),
                Arguments.of( Days.MON.day, 3, Days.THU.day ),
                Arguments.of( Days.MON.day, 4, Days.FRI.day ),
                Arguments.of( Days.MON.day, 5, Days.SAT.day ),
                Arguments.of( Days.MON.day, 6, Days.SUN.day ),

                Arguments.of( Days.MON.day, 7, Days.MON.day ),

                Arguments.of( Days.MON.day, 0, Days.MON.day ),

                Arguments.of( Days.WED.day, 2, Days.FRI.day ),
                Arguments.of( Days.SAT.day, 23, Days.MON.day )

        );
    }
}