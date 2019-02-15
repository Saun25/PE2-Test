package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome pt;
    @Before
    public void setUp() throws Exception {
        pt=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        pt=null;
    }

    @Test
    public void checkPalindromeSuccess() {
        assertEquals("a given number is palindrome",pt.checkPalindromeString("121"));
        assertEquals("a given number is palindrome",pt.checkPalindromeString("12321"));
        assertEquals("a given number is palindrome",pt.checkPalindromeString("1"));
        assertEquals("a given number is palindrome",pt.checkPalindromeString("1234321"));
        assertEquals("a given number is palindrome",pt.checkPalindromeString("0"));

    }
    @Test
    public void checkPalindromeFailure() {
        assertEquals("a given number is not a palindrome",pt.checkPalindromeString("123"));
        assertEquals("a given number is not a palindrome",pt.checkPalindromeString("456"));
        assertEquals("a given number is not a palindrome",pt.checkPalindromeString("456789"));
        assertEquals("a given number is not a palindrome",pt.checkPalindromeString("123456"));
        assertEquals("a given number is not a palindrome",pt.checkPalindromeString("457456"));
        assertEquals("a given number is not a palindrome",pt.checkPalindromeString("-321223"));

    }

    @Test
    public void checkPalindromeStringSuccess() {
        assertEquals("a given number is palindrome",pt.checkPalindromeString("dad"));
        assertEquals("a given number is palindrome",pt.checkPalindromeString("madam"));
        assertEquals("a given number is palindrome",pt.checkPalindromeString(""));
        assertEquals("a given number is palindrome",pt.checkPalindromeString(" "));
        assertEquals("a given number is palindrome",pt.checkPalindromeString("s"));
    }
    @Test
    public void checkPalindromeStringFailure() {
        assertNotEquals("a given number is palindrome",pt.checkPalindromeString("sad"));
        assertNotEquals("a given number is palindrome",pt.checkPalindromeString("story"));
    }
}