package com.home.samples.designpatterns.behavorial.strategy;

/**
 * Created by nagendra on 14/12/2016.
 */
public interface ValidationStrategy {
//CompressionStrategy - ZipCompressionStrategy/TarCompressionStrategy
    boolean validate(String str);

}
