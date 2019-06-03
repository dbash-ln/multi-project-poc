package com.qad;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testPi2Decimals() {
        System.out.println("testPi2Decimals()");
        assertEquals("3.14", MathUtils.getPiString(2));
    }

    @Test
    public void testPiInteger() {
        System.out.println("testPiInteger()");
        assertEquals("3", MathUtils.getPiString(0));
        assertEquals(true, true);
    }

    @Test
    public void testPiAllDigits() {
        System.out.println("testPiAllDigits()");
        assertEquals(String.valueOf(Math.PI), MathUtils.getPiString(-1));
    }

    @Test
//    @Ignore
    public void failingTest() {
        System.out.println("failingTest()");
        assertTrue(true);
    }
}