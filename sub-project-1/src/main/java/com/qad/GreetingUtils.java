package com.qad;

public class GreetingUtils {
    public static String getGreeeting(String name) {
        return ("Hello " + (name == null ? "Anonymous" : name));
    }

    public static String getMathGreeting(String name) {
        return ("Hello " + (name == null ? "Anonymous" : name) + " - would like you some " + MathUtils.getPiString(3) + " today?");
    }
}
