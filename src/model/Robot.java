
package model;
import datastore.*;

public class Robot extends Humanoid {

    private final String purpose;

    public Robot(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public void speak() {
        System.out.println("Hello, I'm a robot.");
    }

    @Override
    public void move(String dest) {
        System.out.println("Moving to " + dest + " using gears and circuits.");
    }

    public String predictText() {
        return "next word";
    }

    @Override
    public void toCSV() {
        // here we actually implement to CSV writing
    }

}
