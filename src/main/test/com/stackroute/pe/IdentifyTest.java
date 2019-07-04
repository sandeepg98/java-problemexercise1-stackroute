package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyTest {
    Identify object;

    @Before
    public void setUp() {
        object = new Identify();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //For lower case input
    @Test
    public void lowerCase() {
        String output = object.identify('a');
        assertEquals("Lower Case", output);
    }

    //for upper case input
    @Test
    public void UpperCase() {
        String output = object.identify('A');
        assertEquals("Upper Case", output);
    }

    //for integer input
    @Test
    public void digit() {
        String output = object.identify('6');
        assertEquals("Digit", output);
    }

    //for special character input
    @Test
    public void specialCharacter() {
        String output = object.identify('!');
        assertEquals("Special Character", output);
    }
}