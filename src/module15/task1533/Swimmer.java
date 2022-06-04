package module15.task1533;

public interface Swimmer {
   /* protected*/ default int getResult() { // строка 2
        return 15;
    }
    default void swim() {
        System.out.println("Swimming");
    }
}