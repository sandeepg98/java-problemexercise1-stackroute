package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {
    TomAndJerry object;

    @Before
    public void setUp() {
        object = new TomAndJerry();
    }

    @After
    public void tearDown()  {
        object = null;
    }

    //Test for tom
    @Test
    public void tom() {
        String output = object.check(21);
        assertEquals("Tom!", output);
    }

    //Test for jerry
    @Test
    public void jerry() {
        String output = object.check(24);
        assertEquals("Jerry!", output);
    }

    //Test for invalid input
    @Test
    public void invalid() {
        String output = object.check(31);
        assertEquals("Invalid Output", output);
    }
}