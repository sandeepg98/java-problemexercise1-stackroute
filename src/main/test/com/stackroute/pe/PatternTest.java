package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern object = new Pattern();

    @Before
    public void setUp(){
        object = new Pattern();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //Test for input 3
    @Test
    public void testRun() {
        String output = object.pattern(3);
        assertEquals("1 2 2 3 3 3 ", output);
    }
}