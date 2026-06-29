import java.time.LocalDate;
import static java.time.DayOfWeek.*;

public class Sample {
    public static void main(String[] args) {
        var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
        // System.out.println(today);
        switch (today) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("weekend.");
                break;
            case MONDAY:
                FRIDAY: System.out.println("working.");
            default:
                System.out.println("other.");
        }
    }
}

// 16. 次のプログラムをコンパイル、実行した結果として、正しいものを選びなさい（１つ選択）。
// A. working
// B. working other
// C. Tuesday
// D. other
// Answer. D
//
// LocalDate.now()メソッド ->現在日時をもったインスタンスを生成
// with(TUESDAY)メソッド -> 次の火曜日に設定
// getDayOfWeek()メソッド -> その日の曜日を取得
