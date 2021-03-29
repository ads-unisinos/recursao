package com.company;

public class HandlingFactorial
{
    public static int factorial( int n ) throws IllegalArgumentException
    {
        if( n < 0) throw new IllegalArgumentException();
        return factorialR(n);
    }

    private static int factorialR ( int n)
    {
        if ( n <= 1) return 1;
        return n * factorial( n - 1 );
    }
}
