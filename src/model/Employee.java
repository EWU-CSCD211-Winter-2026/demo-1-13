package model;

/**
This is an Employee class
 */
public abstract class Employee {

    private String W2;
    private int baseSalary;
    
    private Humanoid humanoid;

    /**
     * Constructor for Employee
     */
    public Employee(Human human) {
        this.humanoid= human;
        init();
    }

    public Employee(Robot robot) {
        this.humanoid = robot;
        init();
    }

    public void init() {
        this.W2 = "Taxes";
        this.baseSalary = 100000;
        attendOrientation();
    }

    public abstract void attendOrientation();

    public abstract void quit();

    public Humanoid getHumanoid() {
        return humanoid;
    }

    /**
     * Getter for salary
     * @return the salary
     */
    public int getSalary() {
        boolean hasAccess = true;
        if (hasAccess) {
            return baseSalary;
        } else {
            throw new RuntimeException("You do not have access to Employee salary data.");
        }
        // return salary;
    }

    /**
     * Getter for Employee W2
     * @return the String representation of the W2
     */
    public String getW2() {
        return W2;
    }

    /**
     * generates a W2 for employee taxes
     */
    public void generateW2() {
        System.out.println("Generating W2");
        this.W2 = "1098 form for the current year.";
    }

    /**
     * Setter for salary
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        boolean hasAccess = false; // or true if some other conditions are met

        if (hasAccess) {
            this.baseSalary = salary;
        } else {
            throw new RuntimeException("You do not have privilege necessary to change the salary.");
        }
    }

    
    
}
