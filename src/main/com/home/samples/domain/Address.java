package com.home.samples.domain;

/**
 * Created by nagendra on 24/11/2016.
 */
public class Address {

    private String line1;

    private String postCode;

    public Address(String line1, String postCode) {
        this.line1 = line1;
        this.postCode = postCode;
    }

    public String getLine1() {
        return line1;
    }

    public String getPostCode() {
        return postCode;
    }
}
