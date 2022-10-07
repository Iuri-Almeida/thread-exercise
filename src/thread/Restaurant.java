package thread;

import java.util.concurrent.BlockingQueue;

public class Restaurant implements Runnable {

    private final BlockingQueue<String> bq;
    private final String order;

    public Restaurant(BlockingQueue<String> bq, String order) {
        this.bq = bq;
        this.order = order;
    }

    @Override
    public void run() {
        try {
            this.bq.put(this.order);
            System.out.println(Thread.currentThread().getName() + " entregou o pedido com " + this.order);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
