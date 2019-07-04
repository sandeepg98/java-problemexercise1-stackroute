package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsAndConsonantsTest {
    VowelsAndConsonants object;

    @Before
    public void setUp() {
        object = new VowelsAndConsonants();
    }

    @After
    public void tearDown()  {
        object = null;
    }

    //When consonant is followed by vowel
    @Test
    public void vowelConsonant() {
        String output = object.vowCons("as");
        assertEquals("Vowel Consonant ", output);
    }

    //when vowel is followed by consonant
    @Test
    public void consonantVowel() {
        String output = object.vowCons("sa");
        assertEquals("Consonant Vowel ", output);
    }
}