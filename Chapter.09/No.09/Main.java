// 9. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add(2, "B"); // たぶんここで、Exception
        list.add("C");
        list.add("D");
        for (String str : list) {
            System.out.println(str);
        }
    }
}

// A. ABCD
// B. ACBD
// C. ACDB
// D. コンパイルエラーが発生
// E. 例外スロー
//
// 解答E.