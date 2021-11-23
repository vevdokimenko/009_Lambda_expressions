package homework;

/*
 * Задание 3
 * Создать класс Book, сделать 3 поля и соответствующие методы.
 * Необходимо реализовать замыкание анонимного класса и лямбда-выражения
 * */

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {
        String title = "Thinking in Java";
        String author = "Bruce Ekkel";
        int pagesCount = 1482;

        Book book = new Book();
        Consumer<Book> setTitle = item -> item.setTitle(title);
        Consumer<Book> setAuthor = item -> item.setAuthor(author);
        Consumer<Book> setPages = item -> item.setPagesCount(pagesCount);

        setTitle.accept(book);
        setAuthor.accept(book);
        setPages.accept(book);

        System.out.println(book);
    }
}

class Book {
    private String title;
    private String author;
    private int pagesCount;

    public Book(){}

    public Book(String title, String author, int pagesCount) {
        this.title = title;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}

@FunctionalInterface
interface NewBook {
    Book set(String title, String author, int pagesCount);
}
