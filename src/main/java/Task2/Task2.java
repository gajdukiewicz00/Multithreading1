package Task2;

public class Task2 {
    public static void main(String[] args) {
        RunnableTask runnableTask = new RunnableTask();
        T1Thread t1Thread = new T1Thread();
        Thread thread = new Thread(runnableTask);
        thread.start();
        t1Thread.start();
        System.out.println("Основной поток завершён.");
    }
}
