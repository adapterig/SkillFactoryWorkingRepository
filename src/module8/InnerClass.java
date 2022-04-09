package module8;

public class InnerClass {
    String name;
    int count;
    static int counter = 0;

    void setName(String name, int number) {
        this.name = name;
        this.count = number;
        counter++;
        class Player {
            boolean isPlayable;
           // if(InnerClass.counter >2)

            {
                isPlayable = true;
            }

        }
    }
}
