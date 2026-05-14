// 28.次のプログラムを確認してください。
public class Sample {
    /* private アクセス修飾子は問題文になし */ int num;

    // 問題文にはない初期化子
    {
        setNum(10);
    }

    /* public アクセス修飾子は問題文になし */ int getNum() {
        return num;
    }

    /* private アクセス修飾子は問題文になし */ void setNum(int num) {
        this.num = num;
    }
}
// このクラスにカプセル化を適用したい。
// 次の中から正しいコードを選びなさい（１つ選択）。
// コードは初期化子を追加しています。

// A.
// public class Sample {
// private int num;
// private int getNum() { return num; }
// private void setNum(int num) { this.num = num; }
// }
//
// B.
// public class Sample {
// public int num;
// public int getNum() { return num; }
// public void setNum(int num) { this.num = num; }
// }
//
// C.
// public class Sample {
// public int num;
// private int getNum() { return num; }
// private void setNum(int num) { this.num = num; }
// }
//
// D.
// public class Sample {
// private int num;
// public int getNum() { return num; }
// private void setNum(int num) { this.num = num; }
// }
//
//
// 解答D.
// A.は使えません。B.はおいらがやりそうな意味のないこと。Cは、意味ないです。
