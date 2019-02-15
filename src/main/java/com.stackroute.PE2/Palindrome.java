package com.stackroute.PE2;

import java.util.Arrays;

public class Palindrome {
    public String checkPalindromeString(String s) {
        String reverse="";
        String result;
        for(int i=s.length()-1;i>=0;i--) {
            reverse = reverse + (s.charAt(i));
        }
        System.out.println(reverse);
        if(reverse.equals(s)){
            result="a given number is palindrome";
        }
        else{
            result="a given number is not a palindrome";
        }
        return result;
    }
}
