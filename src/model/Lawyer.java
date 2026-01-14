package model;

public class Lawyer extends Employee {

    private String JD;
    private String[] licenses;

    public Lawyer(String name, int salary) {
        super(name, salary);
    }

    public boolean sue(Person person) {
        System.out.println("Suing " + person);
        return true;
    }
    
}
