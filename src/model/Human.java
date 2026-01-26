package model;

/**
 * Represents a Human 
 */
public class Human extends Humanoid implements Nameable {
    
    final private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void speak() {
        System.out.println("Hello, I'm a person.");
    }

    @Override
    public void move(String dest) {
        System.out.println("Human moving to " + dest + " using biological arms and legs.");
    }
}
