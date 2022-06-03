package module15.task1523;

public class Main {
    public static void main(String[] args) {
        doubleFromString(5, (a) -> a + 1);
    }

    public static double doubleFromString(int value, Worker worker) {
        return worker.rework(value);
    }
}
