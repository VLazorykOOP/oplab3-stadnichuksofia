package src;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        User admin = new ConcreteUser(new AdminUser(), "Admin");
        User regular = new ConcreteUser(new RegularUser(), "Regular User");

        library.addUser(admin);
        library.addUser(regular);

        Book book1 = new Book("Design Patterns", "GOF");
        Book book2 = new Book("Effective Java", "Joshua Bloch");

        library.addBook(book1);
        library.addBook(book2);

        ConcreteVisitor visitor = new ConcreteVisitor();

        library.accept(visitor);

        admin.manageBooks();
        regular.manageBooks();
    }
}
