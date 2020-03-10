package com.yhy.springboot.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @FileName: HelloWord
 * @Author Steven
 * @Date: 2020/3/7
 */
public class HelloWord {

   byte[] b=new byte[1024*100];

    public static void main(String[] args) throws InterruptedException {

        List<HelloWord> all=new ArrayList<>();
        while (true){
            all.add(new HelloWord());
            TimeUnit.SECONDS.sleep(1);
        }
    }
}

