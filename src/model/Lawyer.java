package model;

/**
 * Lawyer class extends {@link Employee}
 */
public class Lawyer extends Employee {

    private String JD;
    private String[] licenses;

    /**
     * Constructor for a Lawyer
     * @param name the name of the lawyer
     */
    public Lawyer(Human human) {
        super(human);
    }

    public Lawyer(Robot r) {
        super(r);
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 10000;
    }

    @Override 
    public void quit() {
        System.out.println("Notifiying clients that I quit.");
    }

    @Override
    public void attendOrientation() {
        System.out.println("Orientation for a lawyer");
    }

    

    

    /**
     * File a lawsuit against a {@link Person}
     * @param person the person being sued
     * @return true if winning the lawsuit, false otherwise
     */
    public boolean sue(Human human) {
        System.out.println("Suing " + human);
        return true;
    }

    @Override
    public String toString() {
        return "Lawyer, Salary = " + getSalary() + ", humanoid = " + getHumanoid(); 
    }
    
}
