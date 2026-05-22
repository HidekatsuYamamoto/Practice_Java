public class Main {
    public static void main(String[] args) {
        // Cannot instantiate the type Worker
        // Worker w = new Worker();
        Worker a = new Engineer();
        Employee b = new Engineer();
        Engineer c = new Engineer();
        // a.create(); // もともとの問題文
        // たぶんWorker型で推測できるのは実装頼んだworkまでかな。
        // a.work(); // 修正後（呼べるものとすれば）
        c.create(); // 修正後（createしたければ）
        b.work();
        c.report();

        // w.work();
    }
}
// A. Mainクラスのa.create();でコンパイルエラー
// B. Mainクラスのb.work();でコンパイルエラー
// C. Mainクラスのc.report();でコンパイルエラー
// D. 選択肢AとBの両方
// E. 選択肢BとCの両方
