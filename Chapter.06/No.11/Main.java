// 11. Sampleクラスを利用する以下のプログラムの説明として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        // 問題文 String val = s.setValue("hello");
        // 問題文 s.getValue();
        s.setValue("hello"); // 修正
        String val = s.getValue(); // 修正
        System.out.println(val);
    }
}
// A. Mainクラスのvalきったところでエラー
// B. MainクラスのgertValue読んだとこでエラー
// C. AとB両方エラー
// D. 何も表示されない。
// E. nullが表示される。
// F. 実行時に例外がスローされる。
//
// 正解はA。setValueはvoidなのに返り値を設定しようとしていてNG。getValueは
// String型なのに返り値を受け取らない・・・ことはできる。