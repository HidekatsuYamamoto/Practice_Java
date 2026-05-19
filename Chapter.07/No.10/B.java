public class B extends A {
    @Override
    void A2(int i_a2_1, String s_a2_2) {
        System.out.println("A2.B");
    }

    void A1(int i_a1_1) {
        System.out.println("A1.B");
    }

    @Override
    B A3() {
        B b = new B();
        System.out.println("A3.B");
        return b;
    }
}
