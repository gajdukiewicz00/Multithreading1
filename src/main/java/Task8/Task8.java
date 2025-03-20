package Task8;

public class Task8 {
    public static void main(String[] args) {
        SharedState sharedState = new SharedState();
        int delay = 500;
        int countdown = 10;
        int step = delay / 10;

        Producer producer = new Producer(sharedState, delay);
        Consumer consumer = new Consumer(sharedState, countdown, step);

        Thread producerThread = new Thread(producer, "Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}
