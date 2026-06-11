
// 14. 次のうち、値を変更できないか、固定長のリストを作るものを選びなさい（２つ選択）。
// A. var list = List.of(1, 2, 3);
// B. var list = new ArrayList<Integer>();
// C. var list = Arrays.asList(new Integer[]{1,2,3});
// D. var list = new ArrayList<Integer>(3);
// 
// Answer A,C 
//
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // A. var list = List.of(1, 2, 3);
        var list = List.of(1, 2, 3);
        // B. var list = new ArrayList<Integer>();
        var list2 = new ArrayList<Integer>();
        // C. var list = Arrays.asList(new Integer[]{1,2,3});
        var list3 = Arrays.asList(new Integer[] { 1, 2, 3 });
        // D. var list = new ArrayList<Integer>(3);
        var list4 = new ArrayList<Integer>(3);

        // list.add(4); UnsupportedOperationException
        list2.add(5);
        // list3.add(6); UnsupportedOperationException
        list4.add(7);

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}