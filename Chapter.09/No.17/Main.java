// 17. 次のプログラムをコンパイル、実行したときの結果として正しいものを選びなさい（１つ選択）。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>(
        // Arrays.asList("A", "B", "C"));
        List<String> list = new ArrayList<>(
                Arrays.asList(new String[] { "A", "B", "C" }));
        list.removeIf((String s) -> {
            return s.equals("B");
        });
        System.out.println(list);
    }
}

// A. A,B,C
// B. A, C
// C. コンパイルエラー
// D. 例外スロー
//
// 解答B.