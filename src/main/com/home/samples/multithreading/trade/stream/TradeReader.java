package com.home.samples.multithreading.trade.stream;

import java.util.Random;

import static com.home.samples.multithreading.trade.stream.TradeDataContainer.STATUS;
import static com.home.samples.multithreading.trade.stream.TradeDataContainer.SYMBOLS;

/**
 * Created by nagendra on 27/04/2021.
 */
public class TradeReader extends Thread {
    private Random random = new Random();

    private TradeDataContainer tradeDataContainer;

    public TradeReader(TradeDataContainer tradeDataContainer) {
        this.tradeDataContainer = tradeDataContainer;
    }

    @Override
    public void run() {
        while(true) {
            String symbol = SYMBOLS[random.nextInt(SYMBOLS.length)];
            String status = STATUS[random.nextInt(STATUS.length)];
            long largestTradeBySize = tradeDataContainer.getLargestTradeBySize(symbol);
            System.out.println(this.getName() + "-->" + symbol + ":" + largestTradeBySize + "(Size)");
            double averagePrice = tradeDataContainer.getAveragePrice(symbol);
            System.out.println(this.getName() + "-->" + symbol + ":" + averagePrice + "(Average price)");
            double count = tradeDataContainer.getCountByStatus(symbol, status);
            System.out.println(this.getName() + "-->" + symbol + ":" + count + " " + status + "(Status)");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
