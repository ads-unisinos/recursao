package com.company;

public class MetodosRecursivos
{
    public static boolean encontraN ( int[] array , int n) throws IllegalArgumentException
    {
        if( array == null )
        {
            throw new IllegalArgumentException();
        }

        return encontrarN ( array, n, 0);
    }

    private static boolean encontrarN ( int[] array, int n, int i )
    {
        if( i >= array.length) return false;
        if( array[i] == n ) return true;
        return encontrarN(array, n, i+1);
    }

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
