package com.stackroute.pe;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsAndConsonantsTest {
    VowelsAndConsonants object = new VowelsAndConsonants();

    @Test
    public void vowelConsonant() {
        String output = object.vowCons("as");
        assertEquals("Vowel Consonant ", output);
    }

    @Test
    public void consonantVowel() {
        String output = object.vowCons("sa");
        assertEquals("Consonant Vowel ", output);
    }
}