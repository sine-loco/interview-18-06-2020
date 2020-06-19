package ru.snm.interview;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sine-loco
 */
class Task5Test {
    private final Task5 subject = new Task5();


    @ParameterizedTest
    @MethodSource( "forF" )
    void f(int n, int expected) {
        int actual = subject.f( n );

        assertEquals( expected, actual );
    }

    @ParameterizedTest
    @MethodSource( "forSolution" )
    void solution(int n, int expected) {
        int actual = subject.solution( n );

        assertEquals( expected, actual );
    }


    static Stream<Arguments> forSolution() {
        return Stream.of(
                Arguments.of( 0, 0 ),
                Arguments.of( 1, 1 ),
                Arguments.of( 2, 1 ),
                Arguments.of( 3, 2 ),
                Arguments.of( 4, 2 ),
                Arguments.of( 5, 2 ),
                Arguments.of( 6, 3 ),
                Arguments.of( 17, 5 )
        );
    }
        
    static Stream<Arguments> forF() {
        return Stream.of(
                Arguments.of( 0, 0 ),
                Arguments.of( 1, 1 ),
                Arguments.of( 3, 6 ),
                Arguments.of( 4, 10 ),
                Arguments.of( 5, 15 ),
                Arguments.of( 6, 21 ),
                Arguments.of( 7, 28 )
        );
    }
}