package day20FileAndMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7ThreadPool {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        executor.execute(new Task("task1"));
        executor.execute(new Task("task2"));
        executor.execute(new Task("task3"));
        executor.execute(new Task("task4"));
        executor.execute(new Task("task5"));
        executor.shutdown();

    }
}
