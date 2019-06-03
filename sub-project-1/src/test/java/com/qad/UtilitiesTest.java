package com.qad;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void testAnonymousGreeting() {
        System.out.println("testAnonymousGreeting()");
        assertEquals("Hello Anonymous", GreetingUtils.getGreeeting(null));
    }

    @Test
    public void testAnonymousMathGreeting() {
        System.out.println("testMathGreeting()");
        assertEquals("Hello Anonymous - would like you some 3.142 today?", GreetingUtils.getMathGreeting(null));
    }
}