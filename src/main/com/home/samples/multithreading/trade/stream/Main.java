package com.home.samples.multithreading.trade.stream;

/**
 * Created by nagendra on 27/04/2021.
 */
public class Main {

    public static void main(String[] args) {
        TradeDataContainer tradeDataContainer = new TradeDataContainer();

        TradeUpdater tradeUpdater = new TradeUpdater(tradeDataContainer);

        TradeReader tradeReader1 = new TradeReader(tradeDataContainer);
        tradeReader1.setName("Reader 1");

        TradeReader tradeReader2 = new TradeReader(tradeDataContainer);
        tradeReader2.setName("Reader 2");

        tradeUpdater.start();
        tradeReader1.start();
        tradeReader2.start();
    }
}
