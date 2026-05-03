// 10. 次のプログラムの3行目の空欄に記述すると無限ループになるコードを選びなさい。
public class Main {
    public static void main(String[] args) {
        /* A */ for (int i = 0; true; i++) {
            /* B */ // for (int i = 0; false; i++) {
            /* C */ // for (int i = 0;; i++) {
            /* D */ // for (int i = 0; i < 5;) {
            System.out.println(i);
        }
    }
}

// 解答ACD
