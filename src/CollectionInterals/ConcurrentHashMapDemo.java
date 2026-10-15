package CollectionInterals;


import java.util.concurrent.*;

public class ConcurrentHashMapDemo {

    public static void main(String[] args)
            throws InterruptedException {

        ConcurrentHashMap<String, Integer> map =
                new ConcurrentHashMap<>();

        Runnable task = () -> {

            for (int i = 0; i < 1000; i++) {

                map.merge("count", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map.get("count"));
    }
}

