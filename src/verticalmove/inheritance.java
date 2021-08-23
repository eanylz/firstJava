package verticalmove;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class inheritance {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger);
        atomicInteger.set(10);
        System.out.println(atomicInteger.getAndSet(22));
        System.out.println(atomicInteger.get());
    }

}





