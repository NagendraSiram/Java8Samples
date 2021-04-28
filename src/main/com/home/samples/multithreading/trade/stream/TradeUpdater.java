package com.home.samples.multithreading.trade.stream;

import java.text.DecimalFormat;
import java.util.Random;

import static com.home.samples.multithreading.trade.stream.TradeDataContainer.STATUS;
import static com.home.samples.multithreading.trade.stream.TradeDataContainer.SYMBOLS;

/**
 * Created by nagendra on 27/04/2021.
 */
public class TradeUpdater extends Thread {

    private Random random = new Random();

    private TradeDataContainer tradeDataContainer;

    public TradeUpdater(TradeDataContainer tradeDataContainer) {
        this.tradeDataContainer = tradeDataContainer;
    }

    @Override
    public void run() {
        while (true) {
            long timestamp = System.currentTimeMillis();
            String symbol = SYMBOLS[random.nextInt(SYMBOLS.length)];
            double leftLimit = 1D;
            double rightLimit = 200D;
            double priceDouble = leftLimit + random.nextDouble() * (rightLimit - leftLimit);
            DecimalFormat df = new DecimalFormat("#.##");
            double price = Double.valueOf(df.format(priceDouble));
            long size = random.nextInt(20) * 100;
            String status = STATUS[random.nextInt(STATUS.length)];

            System.out.println(String.format("Current Trade Data : [timestamp:%d, symbol:%s, price:%.2f, size:%d, status:%s]", timestamp, symbol, price, size, status));
            tradeDataContainer.addNewTrade(timestamp, symbol, price, size, status);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

}
