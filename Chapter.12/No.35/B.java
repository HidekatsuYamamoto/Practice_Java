public class B extends A {
    private void print() {
        System.out.println("B");
    }

    public void b() {
        print();
    }

    public static void main(String[] args) {
        B b = new B();
        b.a();
        b.b();
    }
}

// 35.
// A. A B
// B. B B
// C. Compilation error
// D. throw an exception
//
// Ans. A.