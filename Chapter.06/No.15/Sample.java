// 15. 次のプログラムをコンパイル、実行したときの結果として、
// 　　正しいものを選びなさい（１つ選択）。
public class Sample {
    public void method(int num) {
        if (num < 0)
            return;
        System.out.println("A");
        return;
        System.out.println("B");
    }
}
// C. 6行目でコンパイルエラー