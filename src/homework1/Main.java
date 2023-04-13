package homework1;


import java.util.Arrays;

public class Main {

    public static void task() {
        Author gesse = new Author("Герман","Гессе");
        Author elisarov = new Author("Михаил","Елизаров");

        Book book1 = new Book("Игра в бисер", gesse, 1995);
        Book book2 = new Book("Библиотекарь",  elisarov, 2007);

        System.out.println("book1.getAuthor().getLastName() = " + book1.getAuthor().getLastName());


        book1.setPublishingYear(2005);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
    }

}
