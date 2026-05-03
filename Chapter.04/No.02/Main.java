// 2. コンソールに0～4までの数字を表示したい。プログラムの空欄⓵と⓶に入るコードの組み合わせとして正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        int a = 0;
        do { // ⓵
            System.out.println(a);
            a++;
        } while (a < 5); // ⓶
    }
}
//
// A. ⓵ do( a < 5 ) ⓶ while :
// B. ⓵ do( 5 < a) ⓶ while :
// C. ⓵ do ⓶ while (a < 5) :
// D. ⓵ do ⓶ while (5 < a) :
// 正解：C