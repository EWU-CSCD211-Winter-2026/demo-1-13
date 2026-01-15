package model;

public class Marketer extends Employee {

    
    @Override
    public int getSalary() {
        return super.getSalary() + 50000;
    }
}
