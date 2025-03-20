package Task4;

public class Task4 {
    public static void main(String[] args) {
        String[] messages = {"Первый поток", "Второй поток", "Третий поток", "Четвертый поток", "Пятый поток", "Шестой поток"};
        for (int i = 0; i < 6; i++) {
            new ParameterizedThread(messages[i]).start();
        }
    }
}
