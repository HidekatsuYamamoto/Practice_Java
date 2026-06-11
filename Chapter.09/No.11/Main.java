// 11. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 
// A. 「A」「B」「C」「A」と表示される。
// B. 「B」「C」「A」と表示される。
// C. 「B」「C」と表示される。
// D. コンパイルエラー
// E. 例外スロー
//
// 解答B.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("A", 100));
        // dispStr(1, list);
        list.add(new Item("B", 200));
        // dispStr(2, list);
        list.add(new Item("C", 300));
        // dispStr(3, list);
        list.add(new Item("A", 100));
        // dispStr(4, list);
        list.remove(new Item("A", 500));

        // System.out.println("No.5/ ");
        for (Item item : list) {
            System.out.println(item.getName());
        }
    }

    // static void dispStr(int no, ArrayList<Item> list) {
    // System.out.println("No." + no + "/ ");
    // for (Item item : list) {
    // System.out.println(item.getName());
    // }
    // }
}
