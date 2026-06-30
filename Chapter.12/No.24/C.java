public interface C extends A {
    @Override
    default void sample() {
        System.out.println("C");
    }

}
