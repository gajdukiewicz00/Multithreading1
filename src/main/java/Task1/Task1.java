package Task1;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= n; i++) {
                System.out.println("Порожденный поток: строка " + i);
            }
        });
        thread.start();
        for (int i = 1; i <= n; i++) {
            System.out.println("Родительский поток: строка " + i);
        }
    }
}