public class Main {
    public static void main(String[] args) {
        Item a = new Item();
        Item b = new Item();

        a.name = "apple";
        b.price = 100;
        a.price = 200;
        b.name = "banana";
        a = b;
        a.printInfo();
    }
}

// A. apple, 100
// B. banana, 100
// C. apple, 200
// D. banana, 200
// E. 例外スロー
// F. コンパイルエラー
// 正解：B. banana, 100
