package other;

public class MySubClass extends MyClass {

    public MySubClass(int attr1) {
        super(attr1);
    }
    public MySubClass() {
        this(2);
    }

    public MySubClass(int a, int b) {
        super();
    }

    @Override
    public String toString() {
        return "a string";
    }

}