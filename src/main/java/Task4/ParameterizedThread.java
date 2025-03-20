package Task4;

class ParameterizedThread extends Thread {
    private String message;

    public ParameterizedThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " " + i);
        }
    }
}