// 73. 135
public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        // B.
        for (int i = 0; i < 5; i += 2)
            System.out.print(array[i]);
    }
}

// A. int i = 0; i <= 4; i++ <--- 1,2,3,4,5になる。
// B. 〇
// C. int i = 1; i <= 5; i += 1 <---- 2,3,4,5,ArrayIndexOutOfBoundsException
// D. int i = 1; i < 5; i +=2 <---- 2,4
//
// Ans. B