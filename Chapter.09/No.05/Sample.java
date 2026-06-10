
// 5. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
import java.time.LocalDate;

public class Sample {

    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2015, 0, 1);
        LocalDate b = LocalDate.parse("2015-01-01");
        System.out.println(a.equals(b));
    }
}

// A. true
// B. false
// C. A compliation error occurred in line 7.
// D. A compliation error occurred in line 8.
// E. An exception occurred
//
// Answer. E