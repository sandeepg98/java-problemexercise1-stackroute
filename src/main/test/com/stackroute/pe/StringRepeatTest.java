package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {

    StringRepeat object;

    @Before
    public void setUp() {
        object = new StringRepeat();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //Random testing
    @Test
    public void testRun() {
        String output = object.stringRepeat("Stackroute", 5);
        assertEquals("Stackrouterouterouterouterouteroute", output);
    }
}