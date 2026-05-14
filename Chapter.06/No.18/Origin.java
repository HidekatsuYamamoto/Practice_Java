public class Origin {
    void method() {
        System.out.println("origin");
    }

    void method(int a) {
        System.out.println("Overload method(int a)");
    }

    int method(String i) {
        System.out.println("Overload method(String i)");
        return i.length();
    }
}
