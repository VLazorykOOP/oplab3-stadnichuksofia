package src;

public abstract class User {
    protected UserType userType;

    protected User(UserType userType) {
        this.userType = userType;
    }

    public abstract void accept(Visitor visitor);

    public void manageBooks() {
        userType.manageBooks();
    }

    public abstract String getName();
}
