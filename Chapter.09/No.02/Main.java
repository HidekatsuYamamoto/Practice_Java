
// 2.次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sample[] samples = {
                new Sample(3, "C"),
                new Sample(2, "B"),
                new Sample(1, "A")
        };

        List<Sample> list = new ArrayList<Sample>(Arrays.asList(samples));
        list.sort(new SampleComparator());
        for (Sample s : list) {
            System.out.println(s.getName());
        }
    }
}

//
// A. A B C
// B. B C A
// C. C B A
// D. 何も表示されない
//
// 正解：C