package src;

public interface Visitor {
    void visit(Book book);
    void visit(User user);
}
