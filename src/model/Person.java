package model;

/**
 * Represents a Person
 */
public abstract class Person {
    
    final private String name;

    /**
     * Constructor for Person
     * @param name the name for the Person
     */
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
