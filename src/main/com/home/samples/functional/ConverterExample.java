package com.home.samples.functional;

/**
 * Created by nagendra on 22/11/2016.
 */
public class ConverterExample {

    public static void main(String[] args) {
        Converter<String, Integer> converter1 = (from) -> Integer.valueOf(from);
        //(or)
        //pass references of methods or constructors via the :: keyword
        Converter<String, Integer> converter2 = Integer::valueOf;

        Integer converted = converter1.convert("123");
        System.out.println(converted);

        //Eg:2
//        class Something {
//            String startsWith(String s) {
//                return String.valueOf(s.charAt(0));
//            }
//        }

//        Something something = new Something();
//        Converter<String, String> converter = something::startsWith;
//        String converted = converter.convert("Java");
//        System.out.println(converted);    // "J"
    }
}
