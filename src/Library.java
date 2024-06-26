package src;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;

    private List<Book> books;
    private List<User> users;

    private Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }

    public void accept(Visitor visitor) {
        for (Book book : books) {
            book.accept(visitor);
        }
        for (User user : users) {
            user.accept(visitor);
        }
    }
}
