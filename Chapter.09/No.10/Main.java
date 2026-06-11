// 10. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.set(0, "B");
        list.add("C");
        list.set(1, "D");
        for (String str : list) {
            System.out.println(str);
        }
    }
}

// A. BD
// B. AD
// C. BC
// D. BCD
// E. ABCD
// F. コンパイルエラー
// G. 例外スロー
//
// 解答A.
