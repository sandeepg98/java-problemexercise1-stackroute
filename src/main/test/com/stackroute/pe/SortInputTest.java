package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortInputTest {
    SortInput object = new SortInput();

    @Test
    public void testRun() {
        String output = object.sortInput(12345);
        assertEquals("54321 and sum of even digits is less than 15", output);
    }

    @Test
    public void testRun1() {
        String output = object.sortInput(2468642);
        assertEquals("8664422 and sum of even digits is greater than 15", output);
    }
}