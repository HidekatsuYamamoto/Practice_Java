// 1. 次の計算式を使い、毎年積立を行って福利運用したときの金額を計算したい。
// この計算を行うコードとして正しいものを選びなさい。
//
// n = m * ((1 + r) ^ y - 1) / r
//
// n: 受け取り総額
// m: 毎年の積立金額
// r: 年利率
// y: 積立年数
//
public class Main {
    public static void main(String[] args) {
        double m = 1000; // 毎年の積立金額
        double r = 0.05; // 年利率
        int y = 10; // 積立年数

        double n = m * (Math.pow(1 + r, y) - 1) / r; // 計算式を使用して受け取り総額を計算

        System.out.println("受け取り総額: " + n);
    }
}
//
// A. (int) (m * (Math.pow((1 + r), x) - 1) / r);
// B. (int) (m * (Math.pow(x, (1 + r)) - 1) / r);
// C. (int) (m * (Math.sqrt((1 + r)) - 1) / r);
// D. (int) (m * (Math.sqrt((1 + r), x) - 1) / r);
//
// 解答：A.
