package module6;

public class Print {
    public void print(int i) {
        System.out.println(i);
    }

    public void print(String s) {
        System.out.println(s);
    }

    public void print(int[] ints) {
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public void print(String[] strings) {
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
