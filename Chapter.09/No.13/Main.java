// 13. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (String str : list) {
            if ("C".equals(str)) {
                list.remove(str);
            }
        }
        for (String str : list) {
            System.out.println(str);
        }

    }
}

// A. ABDE
// B. ABCDE
// C. ABE
// D. コンパイルエラー
// E. 例外スロー
//
// 解答E.
// 参照中のものに変更あり。ConcurrentModificationException