package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome object;

    @Before
    public void setUp() throws Exception {
        object = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    //When input is palindrome and sum of even digits is less than 25
    @Test
    public void checkPalindromeTrueLess() {
        String output = object.palindrome(12321);
        assertEquals("Yes! Sum of even digits is less than 25", output);
    }

    //When input is palindrome and sum of even digits is more than 25
    @Test
    public void checkPalindromeTrueGreater() {
        String output = object.palindrome(2468642);
        assertEquals("Yes! Sum of even digits is greater than 25", output);
    }

    //When input is not palindrome
    @Test
    public void checkPalindromeFalse() {
        String output = object.palindrome(123);
        assertEquals("No", output);
    }
}