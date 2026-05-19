public class C implements B {
    @Override
    public void sample() {
        // [ 空欄 ]
        B.super.sample(); // 問題文にないものを追加した。
        System.out.println("Java");
    }
}
