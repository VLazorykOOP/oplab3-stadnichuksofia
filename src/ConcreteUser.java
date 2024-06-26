package src;

public class ConcreteUser extends User {
    private String name;

    public ConcreteUser(UserType userType, String name) {
        super(userType);
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
