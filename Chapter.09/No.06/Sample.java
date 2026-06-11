// 6. 次のプログラムをコンパイルし、実行したときの結果として、正しいものを選びなさい。
// なお、現在の日付を2019年8月20日とする（１つ選択）。
// 

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sample {

    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2019, 8, 19);
        LocalDate b = LocalDate.now();
        b.with(DayOfWeek.MONDAY);
        System.out.println(a.equals(b) + " , " + a.isBefore(b));
    }
}

// １．同じ年の同じ日が何曜日か？
// 2026年6月11日は、木曜日。2025年同日は、水曜日。2024年同日は、火曜日、
// 2023年同日は、2024年のうるう月を通過したので、日曜日。
// 2022年同日は、土曜日、2021年は、金曜日、2020年は木曜日、2019年は、
// うるう月を通過したので火曜日。2019年6月11日は火曜日。
//
// ２．DoomsDayにおける基準日の曜日を求める。
// そうすると、2019年6月6日は、11‐6で、11日の5日前で、木曜日となる。
// ドゥームズデイのルールにより、6月6日が木曜日なら、8月8日も木曜日。

// ３．出題の日の関する曜日を求める。
// 8月20日まで、12日間の差。14日間の差で木曜日であれば、
// 8月20日は、火曜日となる（））2019年8月20日は火曜）。
//
// ４．処理を見る。
// LocalDate a = LocalDate.of(2019, 8, 19);
// こちらで2019年8月19日が設定される。
// LocalDate b = LocalDate.now();
// これで2019年8月20日が設定される。
// b.with(DayOfWeek.MONDAY);
// その週の月曜日が調整されるが、どこにも代入したり、設定していない。
// System.out.println(a.equals(b) + " , " + a.isBefore(b));
// 2019年8月20日と19日を比較し、false。そしてisBeforeで月曜日が含まれるのでtrueを返す。

// A. true, true
// B. false, false
// C. true, false
// D. false, true
//
// 解答D.