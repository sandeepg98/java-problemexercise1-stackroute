package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString object;

    @Before
    public void setUp() {
        object = new ReverseString();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //When string is empty
    @Test
    public void emptyString() {
        String output = object.reverseString("");
        assertEquals("Empty String!!", output);
    }

    //when string is non-empty
    @Test
    public void nonEmptyString() {
        String output = object.reverseString("london");
        assertEquals("nodnol", output);
    }
}