package module6;

public class Book extends PrintEdition {
    int quantityOfPages;
    int year;
    String author;
    String[] pages;

    public Book(String name, int quantityOfPages, int year, String author, String[] pages) {
        super(name);
        this.quantityOfPages = quantityOfPages;
        this.year = year;
        this.author = author;
        this.pages = new String[pages.length + 1];
        this.pages[0] = name + ", " + author;
        for (int i = 0; i < pages.length; i++) {
            this.pages[i + 1] = pages[i];
        }
    }

    String getPage(int n) {
        return this.pages[n];
    }
}
