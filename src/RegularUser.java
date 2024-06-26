package src;

public class RegularUser implements UserType {
    @Override
    public void manageBooks() {
        System.out.println("Regular user can borrow/return books.");
    }
}
