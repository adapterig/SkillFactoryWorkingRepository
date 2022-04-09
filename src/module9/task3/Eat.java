package module9.task3;

public interface Eat {
    public default void eat() {
        System.out.println("eating");
    }
}
