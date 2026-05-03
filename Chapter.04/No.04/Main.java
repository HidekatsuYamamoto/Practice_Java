// 4. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 
public class Main {
    public static void main(String[] args) {
        for (int i = 1, /* long */j = 2; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

// 解答C 添え字は、同じ型なら複数きれますので、コンパイルエラーです。正しい選択肢は「コンパイルエラー」です。