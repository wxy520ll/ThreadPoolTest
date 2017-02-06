package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/2/6 0006.
 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。示例代码如下
 */
public class newCachedThreadPoolTest {
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int n=0;n<20;n++){
            ThreadTask task=new ThreadTask(n);
            executorService.execute(task);
        }
    }

}
