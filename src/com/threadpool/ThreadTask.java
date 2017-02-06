package com.threadpool;

/**
 * Created by Administrator on 2017/2/6 0006.
 */

public  class ThreadTask implements Runnable{
    int i;
    public ThreadTask(int i){
        System.out.println("创建线程并且线程号：  "+""+i);
        this.i=i;
    }
    @Override
    public void run() {
        System.out.println("当前线程的序号：  "+this.hashCode() +Thread.currentThread().getName()+"       "+String.valueOf(i));
    }
}