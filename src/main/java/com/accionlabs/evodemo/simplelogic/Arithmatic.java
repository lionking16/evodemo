// Copyright (c) 2023 AccionLabs.
package com.accionlabs.evodemo.simplelogic;

import java.math.BigDecimal;

public class Arithmatic {

    public static BigDecimal add(BigDecimal decimal1, BigDecimal decimal2) {
        return new BigDecimal(decimal1.doubleValue() + decimal2.doubleValue());
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int getMax(int number1, int number2) {
        return (number1 > number2) ? number1:number2;
    }

    public static int getPositiveOnlyMax(int number1, int number2) throws UnsupportedOperationException {
        if(number1 < 0 || number2 < 0) {
            throw new UnsupportedOperationException("One of the number is -ve");
        }

        return getMax(number1, number2);
    }

}
