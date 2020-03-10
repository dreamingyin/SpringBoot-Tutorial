package com.yhy.springboot.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;


/**
 * @FileName: Receiver
 * @Author Steven
 * @Date: 2020/3/10
 */
public class Receiver {

    private static final Logger LOGGER= LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch countDownLatch;
    public Receiver(CountDownLatch countDownLatch) {
        this.countDownLatch=countDownLatch;
    }

    public void receiveMessage(String message){
        LOGGER.info("Receiver>"+message+">");
        countDownLatch.countDown();
    }
}
