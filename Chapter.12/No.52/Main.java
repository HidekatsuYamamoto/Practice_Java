import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 4, 5, 3 };
        int result1 = Arrays.mismatch(array1, array2);
        int result2 = Arrays.compare(array1, array2);
        System.out.println(result1 + ":" + result2);
    }
}
// 52.
// A. -1 : 2
// B. 2 : 3
// C. 2 : -1
// D. 3 : 0
//
// Ans. C.