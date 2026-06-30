public interface B extends A {
    default void sample() {
        System.out.println("B");
    }

}
