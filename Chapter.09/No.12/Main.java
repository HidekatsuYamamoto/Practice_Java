// 12. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String str : list) {
            if ("B".equals(str)) {
                list.remove(str);
            } else {
                System.out.println(str);
            }
        }
    }
}

// A. A C
// B. A B C
// C. A
// D. コンパイルエラー
// E. 例外スロー
//
// 解答C.