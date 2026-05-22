public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = (name) -> {
            System.out.println("hello, " + name + ".");
        };
        Service s = new Service();
        s.setLogic(algorithm);
        s.doProcess("Lambda");

        // algorithm = (name) -> {
        // System.out.println("Good Bye, " + name + ".");
        // };

        // s.setLogic(algorithm);
        // s.doProcess("Lambda");

        // algorithm.perform("I'm asking ya.");

        // 問題文ではない処理
        Appendix_Sample as = new Appendix_Sample();
        as.doProcess();
    }
}

// 1. 次のプログラムを確認し、Mainクラスの空欄に入るコードとして、
// 正しいものを選びなさい（２つ選択）。
//
// A. ()
// B. (name)
// C. (String)
// D. (String name)
//
// 解答：B. D.
// Strategyパターン、付け替え可能なアルゴリズムを実現したもの
// 処理の全体の流れを担当するクラスと、具体的なアルゴリズムを担当するクラスに分けている。