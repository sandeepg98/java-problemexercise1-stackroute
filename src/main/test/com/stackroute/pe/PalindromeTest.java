package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome object = new Palindrome();

    @Test
    public void checkPalindromeTrueLess() {
        String output = object.palindrome(12321);
        assertEquals("Yes! Sum of even digits is less than 25", output);
    }

    @Test
    public void checkPalindromeTrueGreater() {
        String output = object.palindrome(2468642);
        assertEquals("Yes! Sum of even digits is greater than 25", output);
    }

    @Test
    public void checkPalindromeFalse() {
        String output = object.palindrome(123);
        assertEquals("No", output);
    }
}