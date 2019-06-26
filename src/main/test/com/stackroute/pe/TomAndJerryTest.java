package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {
    TomAndJerry object = new TomAndJerry();

    @Test
    public void tom() {
        String output = object.check(21);
        assertEquals("Tom!", output);
    }

    @Test
    public void jerry() {
        String output = object.check(24);
        assertEquals("Jerry!", output);
    }

    @Test
    public void invalid() {
        String output = object.check(31);
        assertEquals("Invalid Output", output);
    }
}