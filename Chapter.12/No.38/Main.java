import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> list = List.of();
        list.add('a');
        list.add('b');
        list.add('c');
        System.out.println(list);
    }
}

// 38.
// A. a, b, c
// B. c, b, a
// C. Compilation error
// D. throw an exception
// Ans.D because List.of() returns an immutable list, and trying to add elements
// to it will throw an UnsupportedOperationException.