package edu.washington.cs.dt.impact.examples;

public class StringPermute {

    public void permute( String str ){
        int length = str.length();
        boolean[] used = new boolean[ length ];
        StringBuffer out = new StringBuffer();
        char[] in = str.toCharArray();

        doPermute( in, out, used, length, 0 );
    }

    public void doPermute( char[] in, StringBuffer out,
            boolean[] used, int length, int level ){
        if( level == length ){
            return;
        }

        for( int i = 0; i < length; ++i ){
            if( used[i] ) {
                continue;
            }

            out.append( in[i] );
            used[i] = true;
            doPermute( in, out, used, length, level + 1 );
            used[i] = false;
            out.setLength( out.length() - 1 );
        }
    }

    public void doNothing(int i) {
        if (i == 5) {
            throw new IllegalArgumentException();
        }
    }
}
