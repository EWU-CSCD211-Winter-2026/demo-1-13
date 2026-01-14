package model;

public class Employee extends Person {

    private String W2;
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.W2 = "Taxes";
        this.salary = salary;
    }

    public void generateW2() {
        System.out.println("Generating W2");
        this.W2 = "1098 form for the current year.";
    }


    
}
