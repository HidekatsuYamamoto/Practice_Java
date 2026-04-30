// 21. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 
public class Main {

    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
            case 2:
            case 3:
                System.out.println("A");
            case 4:
                System.out.println("B");
            default:
                System.out.println("C");
                break;
        }
    }
}

// A. A
// B. A B
// C. A B C
// D. 何も表示されない
// E. コンパイルエラー
// F. 例外スロー

// 解答C