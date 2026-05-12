public class Main {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = a;
        a = null;
        b = null;
        // more code
    }
}

// 次のプログラムを実行し、7行目が終了したときにガベージコレクション
// の対象となるインスタンスはどれか、正しい説明を選びなさい（１つ選択）。
// A. a
// B. b
// C. a and b
// D. none of them

// 正解はBです。
// 7行目でaはnullに設定されますが、cはまだaを参照しているため、
// aのインスタンスはガベージコレクションの対象にはなりません。
// 一方、bはnullに設定されており、他の変数からも参照されていないため、
// bのインスタンスがガベージコレクションの対象となります。