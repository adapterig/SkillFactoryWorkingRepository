package module9.task1;

import module9.task2.Soundable;

public class Cat implements Soundable {
    @Override
    public String makingSound() {
        return "meow";
    }
}
