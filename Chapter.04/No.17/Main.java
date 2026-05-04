// 17.次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
//
public class Main {
    public static void main(String[] args) {
        int total = 0;
        a: for (int i = 0; i < 5; i++) {
            b: for (int j = 0; j < 5; j++) {
                if (i % 2 == 0)
                    continue a;
                if (3 < j)
                    break b;
                total += j;
            }
        }
        System.out.println(total);
    }
}

// i = 0,1,2,3,4
// j = 0,0.1,2,3,4,0,0,1,2,3,4,0,0,1,2,3
// total = 0,1,3,6,6,7,9,12,12

// A. 6
// B. 12
// C. 20
// D. コンパイルエラー
// E. 例外スロー

// Answer : B / 12
