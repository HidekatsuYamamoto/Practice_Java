public class A {
    protected A() {
        this(2);
        System.out.print("1");
    }

    protected A(int a) {
        System.out.print(a);
    }
}