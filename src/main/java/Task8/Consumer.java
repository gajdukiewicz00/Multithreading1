package Task8;

class Consumer implements Runnable {
    private final SharedState sharedState;
    private final int countdown;
    private final int step;

    public Consumer(SharedState sharedState, int countdown, int step) {
        this.sharedState = sharedState;
        this.countdown = countdown;
        this.step = step;
    }

    @Override
    public void run() {
        int counter = countdown;
        try {
            while (counter > 0) {
                sharedState.waitForTrue();
                System.out.println("Consumer: обратный отсчет " + counter);
                Thread.sleep(step);
                counter--;
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer прерван");
        }
    }
}