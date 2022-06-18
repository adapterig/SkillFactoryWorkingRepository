package module17;

public enum  Actions {
    FOREST("в лес"),
    TRADER("торговать"),
    EXIT("выйти"),
    HELP("список комманд");
    public final String title;

    Actions(String action) {
        this.title = action;
    }

    @Override
    public String toString() {
        return title;
    }

    public static void sout() {
        System.out.println("Список доступных комманд:");
        for (Actions s : Actions.values()) {
            System.out.println(s.title);
        }
    }
}
