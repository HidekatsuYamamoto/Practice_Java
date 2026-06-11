// 8. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. ArrayList list = new ArrayList<>();でコンパイルエラー
// B. list.add("A");でコンパイルエラー
// C. list.add(10);でコンパイルエラー
// D. list.add("B");でコンパイルエラー
// E. for (Object obj : list) {でコンパイルエラー
// F. A10Bと表示される。
// G. 例外スロー
// 
// 解答F.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("A");
        list.add(10);
        list.add("B");
        for (Object obj : list) {
            System.out.print(obj);
        }

    }
}