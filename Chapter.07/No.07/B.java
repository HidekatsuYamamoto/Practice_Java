public interface B {
    default void test() { // 問題文
        // default void test2() { // 修正点
        System.out.println("B");
    }
}
