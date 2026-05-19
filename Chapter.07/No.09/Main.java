// 9. AbstractSampleクラス及びConcreteSampleクラスを利用する
// 以下のプログラムを、コンパイル、実行したときの結果として、
// 正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        AbstractSample s = new ConcreteSample();
        s.sample();
    }
}
//
// A.「A」「B」「C」と表示される。
// B.「A」「C」と表示される。
// C.AbstructSampleクラスでコンパイルエラーが発生する。
// D.ConcreteSampleクラスでコンパイルエラーが発生する。
// E.Mainクラスでコンパイルエラーが発生する。
// F.実行時に例外がスローされる。
//
// 解答：A.
// 抽象メソッド側で呼ばれても具現メソッド側。