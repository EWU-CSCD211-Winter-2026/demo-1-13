
package test;

import model.*;

public class App2 {

    public static void main(String[] args) {

        Human human  = new Human("Alice");
        Robot robot  = new Robot("calculator");

        Lawyer l = new Lawyer(human);

        Marketer m = new Marketer(robot);

        Humanoid humanoid = new Robot("assembly line");

        Humanoid[] arr = new Humanoid[3];
        arr[0] = human;
        arr[1] = robot;
        arr[2] = humanoid;

        for (int i = 0; i < arr.length; i++) {
            arr[i].speak();
            if (arr[i] instanceof Robot) {
                Robot r = (Robot) arr[i];
                System.out.println("predicted text: " + r.predictText());
            }
        }
        


    }
}
