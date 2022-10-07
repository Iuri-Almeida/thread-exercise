package thread;

import java.util.concurrent.BlockingQueue;

public class Deliveryman implements Runnable {

    private final BlockingQueue<String> bq;
    private final Long time;

    public Deliveryman(BlockingQueue<String> bq, Long time) {
        this.bq = bq;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
            String order = this.bq.take();
            System.out.println("Entrega de " + order + " finalizada [" + Thread.currentThread().getName() + "].");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
