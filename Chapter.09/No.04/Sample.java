// 4. 次のプログラムをコンパイルし、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Sample {

    public static void main(String[] args) {
        char a = '0';
        int num = 0;
        if (Character.isAlphabetic(a)) {
            num++;
        }
        if (Character.isDigit(a)) {
            num++;
        }
        if (Character.isLowerCase(a)) {
            num++;
        }
        System.out.println(num);
    }
}
// A. 0
// B. 1
// C. 2
// D. 3
// E. コンパイルエラー
//
// 解答B.