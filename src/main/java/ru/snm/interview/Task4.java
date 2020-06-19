package ru.snm.interview;

/**
 * @author sine-loco
 */
public class Task4 {


    String solution( String s, int k ) {
        if ( k < 0 || k > 500 ) {
            throw new IllegalArgumentException();
        }

      /*  if ( k == 0 ) {
            return Days.from( day ).day;
        }*/

        int dayOfWeek = ( k + Days.from( s ).offset ) % 7;

        return Days.from( dayOfWeek ).day;

    }

    enum Days {
        MON( "mon", 0 ),
        TUE( "tue", 1 ),
        WED( "wed", 2 ),
        THU( "thu", 3 ),
        FRI( "fri", 4 ),
        SAT( "sat", 5 ),
        SUN( "sun", 6 ),
        ;

        final String day;
        final int offset;

        Days( String day, int offset ) {
            this.day = day;
            this.offset = offset;
        }


        static Days from( String day ) {
            for ( Days d : Days.values() ) {
                if ( d.day.equalsIgnoreCase( day ) ) {
                    return d;
                }
            }
            throw new IllegalArgumentException();
        }

        static Days from( int offset ) {
            for ( Days d : Days.values() ) {
                if ( d.offset == offset ) {
                    return d;
                }
            }
            throw new IllegalArgumentException( String.valueOf( offset ) );
        }
    }
}

