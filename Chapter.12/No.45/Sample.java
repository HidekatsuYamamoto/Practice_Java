public interface Sample {
    void test();
}

// 45. testメソッドのオーバーライドとして正しくないものを選びなさい（１つ選択）。
// A. 〇
// public class SampleTest implements Sample {
// @Override
// public void test() {
// System.out.println("test");
// }

// }
// B. ✕ 継承や具現のそぶりなしなのにオーバーライド
// public class SampleTest2 {
// @Override
// public void test() {
// System.out.println("test");
// }
// }
// C. 〇
// public abstract class SampleTest3 implements Sample {
// @Override
// public abstract void test();

// }
// D. 〇
// public abstract class SampleTest4 implements Sample {
// @Override
// public void test() {
// System.out.println("test");
// }
// }
//
// Ans. B.