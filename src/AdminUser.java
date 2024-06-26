package src;

public class AdminUser implements UserType {
    @Override
    public void manageBooks() {
        System.out.println("Admin user can add/remove books.");
    }
}
