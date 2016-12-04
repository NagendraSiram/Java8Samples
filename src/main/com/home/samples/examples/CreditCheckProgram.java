package com.home.samples.examples;

import java.util.stream.IntStream;

/**
 * Created by nagendra on 26/11/2016.
 */
public class CreditCheckProgram {

    public static void main(String[] args) {
        final String credit = "123456789";

        boolean isEvenCard = credit.length() % 2 == 0;

        StringBuffer buffer = new StringBuffer();
        IntStream.iterate(0, i -> i + 1)
                .limit(credit.length())
                .forEach(i -> {
                    if (isEvenCard) {
                        buffer.append(getDigit(credit.charAt(i), i % 2 == 0));
                    } else {
                        buffer.append(getDigit(credit.charAt(i), i % 2 != 0));
                    }
                });

        System.out.println(buffer);
    }

    private static int getDigit(char digit, boolean isSecondDigit) {
        int d = Character.getNumericValue(digit);

        if (isSecondDigit) {
            d = d * 2;
        }
        return d;
    }
}
