package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyTest {
    Identify object = new Identify();

    @Test
    public void lowerCase() {
        String output = object.identify('a');
        assertEquals("Lower Case", output);
    }

    @Test
    public void UpperCase() {
        String output = object.identify('A');
        assertEquals("Upper Case", output);
    }

    @Test
    public void digit() {
        String output = object.identify('6');
        assertEquals("Digit", output);
    }

    @Test
    public void specialCharacter() {
        String output = object.identify('!');
        assertEquals("Special Character", output);
    }
}