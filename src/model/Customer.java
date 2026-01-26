package model;

public class Customer extends Human {
    
    public Customer(String name) {
        super(name);
    }

    @Override
    public void move(String dest) {
        System.out.println("Customer is moving to " + dest);
    }

    @Override
    public void speak() {
        System.out.println("I need help getting into my account.");
    }

}
