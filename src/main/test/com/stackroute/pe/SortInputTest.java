package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortInputTest {
    SortInput object;

    @Before
    public void setUp() {
        object = new SortInput();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //When sum of even digits is less than 15
    @Test
    public void testRun() {
        String output = object.sortInput(12345);
        assertEquals("54321 and sum of even digits is less than 15", output);
    }

    //When sum of even digits is greater than 15
    @Test
    public void testRun1() {
        String output = object.sortInput(2468642);
        assertEquals("8664422 and sum of even digits is greater than 15", output);
    }
}