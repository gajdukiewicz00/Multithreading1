package Task8;

class SharedState {
    private boolean state = false;

    public synchronized void setState(boolean newState) {
        state = newState;
        notifyAll();
    }

    public synchronized boolean getState() {
        return state;
    }

    public synchronized void waitForTrue() throws InterruptedException {
        while (!state) {
            wait();
        }
    }
}