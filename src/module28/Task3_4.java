package module28;

public class Task3_4 {
    public static void main(String[] args) {
        Class<?> clazz = Article.class;
        AuthName annotation = clazz.getAnnotation(AuthName.class);
        System.out.println("Author: " + annotation.name());
    }
}
