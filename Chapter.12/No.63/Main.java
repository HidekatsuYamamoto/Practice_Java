// 63. 次のプログラムをコンパイルし、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        int x;
        int y = 3;
        if (y > 2) {
            x = ++y;
            y = x + 5;
        } else {
            y++;
        }
        System.out.println(x + ", " + y);
    }
}
//
// A. 4, 9
// B. 3, 8
// C. Compilation Error
// D. throw an exception
//
// Ans. C.