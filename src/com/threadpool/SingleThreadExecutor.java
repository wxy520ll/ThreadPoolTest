package com.threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/2/6 0006.
 */

/**
 * 通过executors 的静态方法 创建 singleThreadExcutor 实例
 *
 * 当添加的任务超过 。剩下的任务会进入队列。先来先执行
 */
public class SingleThreadExecutor {
    public static void main(String args[]){
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        ThreadTask task1=new ThreadTask(1);
        ThreadTask task2=new ThreadTask(2);
        ThreadTask task3=new ThreadTask(3);
        ThreadTask task4=new ThreadTask(4);
        ThreadTask task5=new ThreadTask(5);
        ThreadTask task6=new ThreadTask(6);
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);
        executorService.execute(task6);
        executorService.shutdown();
    }
}
