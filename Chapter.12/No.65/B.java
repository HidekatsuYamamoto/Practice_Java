public class B extends A {
    B() {
        this(4);
        System.out.print("3");
    }

    B(int b) {
        System.out.print(b);
    }
}
