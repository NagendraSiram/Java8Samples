package com.home.samples.multithreading.trade.stream;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by nagendra on 27/04/2021.
 */
public class TradeDataContainer {

    public static String SYMBOLS[] = {"ABC", "PQR", "XYZ"};
    public static String STATUS[] = {"A", "S", "P"};

    private Map<String, Long> maxSizePerTrade = new ConcurrentHashMap<>();
    private Map<String, Double> averagePerTrade = new ConcurrentHashMap<>();
    private Map<String, Long> countPerTrade = new ConcurrentHashMap<>();
//    a. What is the largest trade by size for any symbol?
//    b. What is the average price for any symbol?
//    c. How many trades seen for any symbol having a specific value for a given field. For example, Symbol ‘ABC’ having Status of ‘X’

    public void addNewTrade(long timestamp, String symbol, double price, long size, String status) {
        synchronized (this) { //TODO: on symbol ?
            Long aSize = maxSizePerTrade.get(symbol);
            if (aSize == null) {
                maxSizePerTrade.put(symbol, size);
            } else {
                if (size > aSize) {
                    maxSizePerTrade.put(symbol, size);
                }
            }

            Long aCount = countPerTrade.get(symbol);
            if (aCount == null) {
                aCount = 1L;
            } else {
                aCount++;
            }
            countPerTrade.put(symbol, aCount);

            Double average = averagePerTrade.get(symbol);
            if (average == null) {
                averagePerTrade.put(symbol, price);
            } else {
                long oldCount = (aCount - 1 == 0 ? 1 : aCount - 1);
                double currentSum = average * oldCount;
                average = (currentSum + price) / aCount;
                averagePerTrade.put(symbol, average);
            }
        }
    }

    public long getLargestTradeBySize(String symbol) {
        Long aLong = maxSizePerTrade.get(symbol);
        return aLong == null ? 0: aLong;
    }

    public double getAveragePrice(String symbol) {
        Double aDouble = averagePerTrade.get(symbol);
        return aDouble == null? 0: aDouble;
    }

    public long getCountByStatus(String symbol, String status) {
        return 0;
    }

}
