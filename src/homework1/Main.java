package homework1;

public class Main {

    public static void task() {
        Author gesse = new Author("Герман","Гессе");
        Author elisarov = new Author("Михаил","Елизаров");

        Book book1 = new Book("Игра в бисер", (gesse.getFirstName() + " " + gesse.getLastName()), 1995);
        Book book2 = new Book("Библиотекарь",  (elisarov.getFirstName() + " " + elisarov.getLastName()), 2007);

        book1.setPublishingYear(2005);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
    }

}
