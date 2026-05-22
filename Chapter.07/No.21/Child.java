public class Child extends Parent {
    public Child() {
        super("B");
        System.out.println("C");
    }

    public Child(String val) {
        this();
        System.out.println(val);
    }
}
