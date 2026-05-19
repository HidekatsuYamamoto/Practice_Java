abstract class A {

    public int num_A = 1;

    A() {
        num_A = 2;
        System.out.println("constructor in class A");
    }

    abstract void A1();

    void A2() {
        String s = new String("ABC from A2.class A");
        System.out.println(s);
    }
}
