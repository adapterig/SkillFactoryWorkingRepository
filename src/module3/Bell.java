package module3;

public class Bell {
    private static boolean dingDong = true;

    public static void sound() {
        if (dingDong) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        dingDong = !dingDong;
    }
}
