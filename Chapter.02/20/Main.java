// 20. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 
public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde"); // 5 + 16 =27
        System.out.println(sb.capacity());
    }
}

// A. 0
// B. 5
// C. 16
// D. 21
//
// 解答D
// 16が追加される。