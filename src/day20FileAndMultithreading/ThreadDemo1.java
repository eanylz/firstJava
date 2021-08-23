package day20FileAndMultithreading;

public class ThreadDemo1  extends Thread{

    public void run(){
        System.out.println("Hello from thread...");
    }

    public static void main(String[] args) {
        ThreadDemo1 t = new ThreadDemo1();
        t.start();

    }
}
