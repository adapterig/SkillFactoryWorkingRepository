package module12.task23;

import java.util.Deque;
import java.util.Queue;

public class Worker {
    private Deque toDoQueue; // у рабочего есть ссылка на очередь из заданий

    public Worker(Deque toDoQueue) {
        this.toDoQueue = toDoQueue; // даем ссылку на очередь в конструкторе
    }

    public void takeTask() {
        Object task = toDoQueue.pollLast(); // вынимаем задание из очереди
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }
}