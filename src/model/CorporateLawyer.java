package model;

public class CorporateLawyer extends Lawyer {

    public CorporateLawyer(Human human) {
        super(human);
        System.out.println("Corporate Lawyer created with human: " + human);
    }
    public CorporateLawyer(Robot robot) {
        super(robot);
        System.out.println("Corporate Lawyer created with robot: " + robot);
    }

    public void sueCorporation() {

    }

}
