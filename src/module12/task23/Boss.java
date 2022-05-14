package module12.task23;

import java.util.Deque;
import java.util.Queue;

public class Boss {
    private Deque toDoQueue;// у босса тоже есть ссылка на очередь из заданий
    public Boss(Deque toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoQueue.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}