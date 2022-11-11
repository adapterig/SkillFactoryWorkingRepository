package module27;

//  Конкретная абстракция. В конструктор в качестве параметра принимает интерфейс Terminal
public class DonaldDuck extends FastFood {
    DonaldDuck(Terminal terminal) {
        super(terminal);
    }

    @Override
    void getInfo() {
        System.out.println("Donald Duck");
    }
}
