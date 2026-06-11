// 7. 次のうち、ArrayListの説明として正しいものを選びなさい（３つ選択）。
// A. nullは扱えない。
// B. 動的な配列として動作する。
// C. 重複した値は扱えない。
// D. スレッドセーフではない。
// E. 値を追加する箇所を制御できる。
//
// 解答B.、D.、E.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);

        // A. nullは扱えない。 → ✕
        a.add(null);

        System.out.println("content:" + a + ", size:" + a.size());

        // B. 動的な配列として動作する。 → 〇
        a.add(3);
        a.add(4);

        System.out.println("content:" + a + ", size:" + a.size());

        // C. 重複した値は扱えない。→ ✕
        a.add(3);
        a.add(4);

        System.out.println("content:" + a + ", size:" + a.size());

        a.remove(1);
        System.out.println("content:" + a + ", size:" + a.size());

        // E. 値を追加する箇所を制御できる。→ 〇
        a.add(1, 5);
        System.out.println("content:" + a + ", size:" + a.size());

        // D. スレッドセーフではない。→ 〇
        Sample();
    }

    public static void Sample() {
        ArrayList b = new ArrayList<Integer>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    b.add(3);
                    System.out.println(b);
                    b.add(4);
                    System.out.println(b);
                    b.remove(1);
                    System.out.println(b);
                } catch (ConcurrentModificationException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                try {
                    b.add(5);
                    System.out.println(b);
                    b.add(6);
                    System.out.println(b);
                    b.remove(1);
                    System.out.println(b);
                } catch (ConcurrentModificationException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
