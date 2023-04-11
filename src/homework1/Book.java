package homework1;

public class Book {
    private String title;
    private String author;
    private int publishingYear;

    public Book(String title, String author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;

    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
