package src;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Visiting book: " + book.getTitle());
    }

    @Override
    public void visit(User user) {
        System.out.println("Visiting user: " + user.getName());
    }
}
