// 1. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        try {
            int[] array = {};
            array[0] = 10;
            System.out.println("finish.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error.");
        }
    }
}
// A. finish
// B. error
// C. finish error
// D. error finish
// E. Compilation error
// F. throw exception
//
// Answer F.