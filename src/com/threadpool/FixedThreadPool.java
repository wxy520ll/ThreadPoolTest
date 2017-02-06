package com.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by Administrator on 2017/2/6 0006.
 * 创建 固定大小的 线程池 。线程可以重用。多出来的任务 进入一个队列
 */
public class FixedThreadPool {
    public static void main(String args[]){
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        ThreadTask task1=new ThreadTask(1);
        ThreadTask task2=new ThreadTask(2);
        ThreadTask task3=new ThreadTask(3);
        ThreadTask task4=new ThreadTask(4);
        ThreadTask task5=new ThreadTask(5);
        ThreadTask task6=new ThreadTask(6);

        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
        new Thread(task4).start();
        new Thread(task5).start();
        new Thread(task6).start();

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);
        executorService.execute(task6);
        executorService.shutdown();
    }
}
