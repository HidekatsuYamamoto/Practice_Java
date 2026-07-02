public class Main {
    public static void main(String[] args) {
        EntityOfItem entity = new EntityOfItem();
        entity.print(entity);
    }
}

// 32. 抽象クラスの定義として、正しいものを選びなさい（１つ選択）。
// A.
// abstract class Item {
// public abstract int calcPrice(Item item);

// public void print(Item item) {
// /* Do something */
// }
// }
//
// B.
// abstract class Item {
// public int calcPrice(Item item);
// public void print(Item item);
// }
// メソッドにabstractがない。
//
// C.
// abstract class Item {
// public int calcPrice(Item item);
// public final void print(Item item) {
// /* Do something */
// }
// }
// メソッドにabstractがない。
// finalは問題なし（printは抽象メソッドではない）。
//
// D.
// abstract class Item {
// public abstract int calcPrice(Item item) {
// /* Do something */
// }
// public abstract void print(Item item) {
// /* Do something */
// }
// }
// abstractで処理かいちゃあかん。
//
// 解答A.