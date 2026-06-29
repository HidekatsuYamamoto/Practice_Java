// 7.次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        int data = 1;
        switch (data) {
            default:
                System.out.println("C");
            case 0:
                System.out.println("A");
                break;
            case 10:
                System.out.println("B");
                break;
        }
    }
}

// A. A
// B. C
// C. CA
// D. CAB
// E. コンパイルエラー
//
// 解答C.