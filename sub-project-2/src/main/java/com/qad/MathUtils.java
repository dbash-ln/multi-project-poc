package com.qad;

import java.text.DecimalFormat;

public class MathUtils {
    public static String getPiString(int precision) {
        if (precision == -1) {
            return String.valueOf(Math.PI);
        } else {
            String decimalFormat = "#";
            for (int decimalDigit = 0; decimalDigit < precision; decimalDigit++) {
                if (decimalDigit == 0) {
                    decimalFormat += ".#";
                } else {
                    decimalFormat += "#";
                }
            }
            DecimalFormat formatter = new DecimalFormat(decimalFormat);
            return formatter.format(Math.PI);
        }
    }
}
