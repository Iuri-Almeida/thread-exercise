import thread.Deliveryman;
import thread.Restaurant;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {

        BlockingQueue<String> bq = new ArrayBlockingQueue<>(3);

        Restaurant r1 = new Restaurant(bq, "Pizza");
        Restaurant r2 = new Restaurant(bq, "Subway");
        Restaurant r3 = new Restaurant(bq, "Japanese Food");
        Restaurant r4 = new Restaurant(bq, "Burger King");
        Restaurant r5 = new Restaurant(bq, "Ice Cream");
        Restaurant r6 = new Restaurant(bq, "Chocolate");

        Deliveryman d1 = new Deliveryman(bq, 2000L);
        Deliveryman d2 = new Deliveryman(bq, 4000L);
        Deliveryman d3 = new Deliveryman(bq, 6000L);
        Deliveryman d4 = new Deliveryman(bq, 8000L);
        Deliveryman d5 = new Deliveryman(bq, 10000L);
        Deliveryman d6 = new Deliveryman(bq, 12000L);

        final Thread t1 = new Thread(r1, "Restaurant 1");
        final Thread t2 = new Thread(r2, "Restaurant 2");
        final Thread t3 = new Thread(r3, "Restaurant 3");
        final Thread t4 = new Thread(r4, "Restaurant 4");
        final Thread t5 = new Thread(r5, "Restaurant 5");
        final Thread t6 = new Thread(r6, "Restaurant 6");

        final Thread t7 = new Thread(d1, "Deliveryman 1");
        final Thread t8 = new Thread(d2, "Deliveryman 2");
        final Thread t9 = new Thread(d3, "Deliveryman 3");
        final Thread t10 = new Thread(d4, "Deliveryman 4");
        final Thread t11 = new Thread(d5, "Deliveryman 5");
        final Thread t12 = new Thread(d6, "Deliveryman 6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();

    }
}