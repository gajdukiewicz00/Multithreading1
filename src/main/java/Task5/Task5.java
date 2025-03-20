package Task5;

public class Task5 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Поток начинает выполнение.");
                Thread.sleep(5000);
                System.out.println("Поток завершён.");
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван: " + e.getMessage());
            }
        });

        thread.start();

        try {
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}