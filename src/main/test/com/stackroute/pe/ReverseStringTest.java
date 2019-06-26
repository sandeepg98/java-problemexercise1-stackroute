package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString object = new ReverseString();

    @Test
    public void emptyString() {
        String output = object.reverseString("");
        assertEquals("Empty String!!", output);
    }

    @Test
    public void nonEmptyString() {
        String output = object.reverseString("london");
        assertEquals("nodnol", output);
    }
}