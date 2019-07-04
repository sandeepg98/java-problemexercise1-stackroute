package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddElementsTest {

    AddElements object;

    @Before
    public void setUp() {
        object = new AddElements();
    }

    @After
    public void tearDown()  {
        object = null;
    }

    //For strings with positive numbers
    @Test
    public void sumOfStringWithPositiveNumbers() {

        String output = object.addElements("12 23 2 4");
        assertEquals("41", output);
    }

    //For strings with negative numbers
    @Test
    public void sumOfStringWithNegativeNumbers() {

        String output = object.addElements("12 23 -2 -4");
        assertEquals("Special Character Used", output);
    }

    //For strings with alphabets
    @Test
    public void sumOfStringWithAlphabets() {

        String output = object.addElements("12 23 abv l");
        assertEquals("Character found", output);
    }

    //For empty strings
    @Test
    public void sumOfEmptyString() {

        String output = object.addElements("");
        assertEquals(null, output);
    }
}