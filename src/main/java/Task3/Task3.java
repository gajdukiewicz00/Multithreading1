package Task3;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        int n = 5;
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= n; i++) {
                System.out.println("Порожденный поток: строка " + i);
            }
        });
        thread.start();
        thread.join();
        for (int i = 1; i <= n; i++) {
            System.out.println("Родительский поток: строка " + i);
        }
    }
}