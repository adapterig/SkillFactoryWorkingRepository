package module12.task34;

import java.util.List;

public class Main {
    public static void addToList(List<? super Parent> list) { // 1
        list.add(new Child()); // 2
        System.out.println("Успешно Добавили в лист");
    }
}

 class Parent {}

 class Child extends Parent {}
