package com.home.samples.multithreading;

import java.util.concurrent.*;

/**
 * Created by nagendra on 10/12/2016.
 */
public class SampleExecutor {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //----1------
        ExecutorService executorService1 = Executors.newSingleThreadExecutor(); //ThreadPoolExecutor
        ExecutorService executorService2 = Executors.newFixedThreadPool(5);
        ExecutorService executorService3 = Executors.newCachedThreadPool(); //60sec

        //----2------
//        executorService1.execute(Runnable ); //returns void
//        Future<?> result = executorService1.submit(Runnable)
//        Future<?> result = executorService1.submit(Callable);

        //----3------
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5); //ScheduledThreadPoolExecutor
//        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(Runnable, delay, TimeUnit.HOURS);
//        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(Callable, delay, TimeUnit.HOURS);

        //----4------
//        future.get(); //wait until task is finished, returns null in case of runnable or value in case of callable
//        future.isDone();
//        future.isCancelled();
//        future.cancel(mayInterruptIfRunning);

        //----5------
//        scheduledFuture.getDelay(TimeUnit.HOURS); //remaining delay associated with this object


        Future<?> future = executorService1.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start of Runnable");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("End of Runnable");
            }
        });

        executorService1.shutdown(); //Otherwise program keeps running
        System.out.println("End of main" + future.get());

    }
}
