// E. 抽象クラスは、すべてのサブクラスが実装しなければならない。→　✕：抽象クラスは異なる。
abstract class C extends A {
    @Override
    void A1() {
        System.out.println("A1 in C");
    }

    abstract void C1();
}
