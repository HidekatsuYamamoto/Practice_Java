// 20. 次のプログラムのコンパイルエラーが発生するのは何行目か。正しいものを選びなさい（２つ選択）。
// A. 6行目
// B. 8行目
// C. 10行目
// D. 12行目
//
// 解答AとB
//
public class Main {

    public static void main(String[] args) {
        final int NUM = 0;
        int num = 10;
        switch (num) {
            case "10":
                System.out.println("A");
                break;
            case num:
                System.out.println("B");
                break;
            case 2 * 5:
                System.out.println("A");
                break;
            case NUM:
                System.out.println("B");
                break;
            default:
                break;
        }
    }
}