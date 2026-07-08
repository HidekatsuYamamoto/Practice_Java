// 62. 次のプログラムをコンパイルし、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        char[][] arrays = { { 'a', 'd' }, { 'b', 'e' }, { 'c', 'f' } };
        for (char[] array : arrays) {
            for (char ch : array) {
                System.out.print(ch);
            }
            System.out.print(" ");
        }
    }
}
// A. 「ad be cf 」
// B. 「abc def 」
// C. 「a d b e c f 」
// D. 「adb ecf 」
//
// Ans. A.