// 5. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[3];
        int total = 0;
        // Item it = new Item();
        for (int i = 0; i < items.length; i++) {
            // items[i] = it;
            total += items[i].price;
        }
        System.out.println(total);
    }
}

// E. 例外スロー
