package com.stackroute.PE2;

public class Factorial {

    public long longFactorial(int input) {
        long factorial=1;
        if(input<0||input>12)
        {
            return 0;
        }
        if(input==0||input==1)
        {
            return 1;
        }
        else {
            for (long i = 2; i <= input; ++i) {
                factorial = factorial * i;
            }
            return factorial;
        }

    }

}
