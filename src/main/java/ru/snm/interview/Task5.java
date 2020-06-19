package ru.snm.interview;

/**
 * @author sine-loco
 */
public class Task5 {
    public int solution( int n ) {
        for ( int idx = 0; idx <= n; idx++ ) {
            int res = f( idx );
            if ( res == n ) { return idx; }
            if ( res > n ) { return idx - 1; }
        }
        return 0;
    }


    public int f( int k ) {
        if ( k < 0 ) { throw new IllegalArgumentException(); }

        if ( k == 0 ) { return k; }

        return k + f( k - 1 );
    }
}
