package com.home.samples;

import com.home.samples.functional.Converter;

/**
 * Accessing outer scope variables from lambda expressions is very similar to anonymous objects.
 * You can access final variables from the local outer scope as well as instance fields and static variables.
 */
public class LambdaScopeExample {

    //Eg: 1
    public static void main(String[] args) {
        //final int num = 1;
        //(or)
        int num = 1; // the variable num does not have to be declared final
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        stringConverter.convert(2);

        //num = 3; //num is implicitly final for the code to compile
    }

    //Eg: 2
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }


}
