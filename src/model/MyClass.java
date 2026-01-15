
package model;

public class MyClass extends Object {

    private int attr1;

    // when defining an explicit constructor with parameters, this gets replaced
    // public MyClass() {
    //     super();
    // }

    // with this
    public MyClass(int attr1) {
        this.attr1 = attr1;
        init();
    }
    public MyClass() {
        this.attr1 = 0;
        init();
    }

    public void init() {

    }

}
