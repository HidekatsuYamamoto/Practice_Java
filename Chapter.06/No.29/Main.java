public class Main {
    public static void main(String[] args) {
        Sample s = new Sample(10);
        modify(s.num);
        System.out.println(s.num);
    }

    private static void modify(int num) {
        num *= 2;
    }
    // private static int modify(int num) {
    // num *= 2;
    // return num; // 修正
    // }
}

// 29. Sampleクラスを利用する上記プログラムを、コンパイル、実行
// したときの結果として正しいものを１つ選択しなさい。
// A. 10
// B. 20
// C. コンパイルエラー
// D. 実行時に例外スロー
//
// 解答A.