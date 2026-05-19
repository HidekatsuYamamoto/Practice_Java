// 6.
public interface B extends A {
    @Override
    default void sample() {
        A.super.sample(); // 問題文にないものを追加した。
    }
}
