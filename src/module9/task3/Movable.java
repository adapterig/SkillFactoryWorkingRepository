package module9.task3;

public interface Movable {
    public default void move() {
        System.out.println("moving");
    }
}
