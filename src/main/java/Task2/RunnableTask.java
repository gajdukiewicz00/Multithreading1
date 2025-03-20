package Task2;

class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Поток RunnableTask выполняется.");
    }
}
