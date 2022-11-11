package module28;

public class Picture implements Deletable {
    String name;
    String path;

    @Override
    public void delete(String articleId) {
        System.out.println("Picture deleted");
    }
}
