package Task8;

class Producer implements Runnable {
    private final SharedState sharedState;
    private final int delay;

    public Producer(SharedState sharedState, int delay) {
        this.sharedState = sharedState;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(delay);
                sharedState.setState(true);
                System.out.println("Producer: состояние true");
                Thread.sleep(delay);
                sharedState.setState(false);
                System.out.println("Producer: состояние false");
            }
        } catch (InterruptedException e) {
            System.out.println("Producer прерван");
        }
    }
}