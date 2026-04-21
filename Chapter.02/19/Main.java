// 19. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 
public class Main {

    public static void main(String[] args) {
        String str = null;
        str += "null";
        System.out.println(str);
    }
}

// A. null と表示される。
// B. nullnull と表示される。
// C. 何も表示されない。
// D. コンパイルエラー
// E. 例外
//
// 解答B
// nullは結合する際、文字列になる。