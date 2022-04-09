package module9.task3;

public interface Edible {
    public default void beEaten() {
        System.out.println("ate");
    }
}
