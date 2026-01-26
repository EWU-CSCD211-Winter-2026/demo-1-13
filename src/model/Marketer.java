package model;

/**
 * Represents a Marketer, extends {@link Employee}
 */
public class Marketer extends Employee {

    /**
     * Constructor for Marketer
     * @param name the name of the marketer
     */
    public Marketer(Human human) {
        super(human);
    }

    public Marketer(Robot robot) {
        super(robot);
    }

    @Override
    public void quit() {
        System.out.println("I quit!");
    }
    
    @Override
    public int getSalary() {
        return super.getSalary() + 50000;
    }

    @Override
    public void attendOrientation() {
        System.out.println("Marketer orientation");
    }


}
