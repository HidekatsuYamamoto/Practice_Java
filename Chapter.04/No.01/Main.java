// 4章1. コンソールに0~4まで数字を順に表示したい。プログラムの5行目の空欄に入る
// コードとして、正しいものを選びなさい（１つ選択）。
//
public class Main {

    public static void main(String[] args) {
        int a = 11;
        int b = 0;
        while (b < 5) {
            if (5 < a) {
                System.out.println(b);
            }
            a--;
            b++;
        }
    }
}
// A. b < 5 〇
// B. 5 < b ✕
// C. 5 < a ✕
// D. a < 5 ✕
// E. true
// F. false
//
// 5 < a true true
// a 11 -> 10 -> 9 -> 8 -> 7 -> 6
// b 0 -> 1 -> 2 -> 3 -> 4 -> 5
// prnt 0 -> 1 -> 2 -> 3 -> 4 -> 5
//
// 解答A