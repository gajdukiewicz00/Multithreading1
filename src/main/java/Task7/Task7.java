package Task7;

public class Task7 {
    public static void main(String[] args) {
        Thread yieldThread = new Thread(new YieldThread(), "Yield");
        Thread noYieldThread = new Thread(new NoYieldThread(), "NoYield");

        yieldThread.start();
        noYieldThread.start();
    }
}