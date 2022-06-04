package module15.task1532;

public interface Worker {
    default void work(){ // строка 1
        System.out.println("Working");
    }
}