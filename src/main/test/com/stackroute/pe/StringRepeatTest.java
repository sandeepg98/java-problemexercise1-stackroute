package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat object = new StringRepeat();

    @Test
    public void testRun() {
        String output = object.stringRepeat("Stackroute", 5);
        assertEquals("Stackrouterouterouterouterouteroute", output);
    }
}