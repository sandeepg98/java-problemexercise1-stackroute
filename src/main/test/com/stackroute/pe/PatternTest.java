package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern object = new Pattern();

    @Test
    public void testRun() {
        String output = object.pattern(3);
        assertEquals("1 2 2 3 3 3 ", output);
    }
}