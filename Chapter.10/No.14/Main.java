
// 14. 次のプログラムをコンパイル、実行したときに発生する例外の種類として、
// 正しいものを選びなさい（１つ選択）。
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.get(0);
    }
}

// A. IndexOutOfBoundsException
// B. ArrayIndexOutOfBoundsException
// C. StringIndexOutOfBoundsException
// D. ListIndexOutOfBpundsException
//
// Ans. A
