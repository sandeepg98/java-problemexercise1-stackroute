package com.stackroute.pe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    GuessNumber ob;

    @Before
    public void setUp(){
        ob = new GuessNumber();
    }

    @After
    public void tearDown(){
        ob = null;
    }

    //When given Integer is Greater Than Target
    @Test
    public void givenIntGreaterThanTarget() {

        //Act
        String result = ob.guessNumber(72,52);
        //Assert
        assertEquals("Number guessed is more than original number", result);
    }

    //When given Integer is less Than Target
    @Test
    public void givenIntLessThanTarget() {
        //Act
        String result = ob.guessNumber(23,52);
        //Assert
        assertEquals("Number guessed is less than original number", result);
    }

    //When given Integer is equal to Target
    @Test
    public void givenIntEqualsTarget() {
        //Act
        String result = ob.guessNumber(52,52);
        //Assert
        assertEquals("Number guessed matches the original number", result);
    }
}