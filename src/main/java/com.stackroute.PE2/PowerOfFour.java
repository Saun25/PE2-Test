package com.stackroute.PE2;

public class PowerOfFour {
    boolean b;
    public boolean power(long n) {
        if(n>0) {
            while (n > 4) {
                if (n % 4 == 0) {
                    b = true;
                } else {
                    b = false;
                }
                n = n / 4;
            }
        }
        else if(n==0){
            b=true;
        }
        else{
            b=false;
        }

        return b;
    }

}
