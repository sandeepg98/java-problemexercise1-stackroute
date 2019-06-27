package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddElementsTest {

    AddElements object = new AddElements();

    @Test
    public void testRun() {

        String output = object.addElements("12 23 2 4");
        assertEquals("41",output);
    }

}