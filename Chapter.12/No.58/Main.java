public class Main {
    public static void main(String[] args) {
        int num = 9;
        if (num++ < 10) {
            System.out.println(num);
        } else {
            System.out.println("B");
        }
    }
}

// 58.
// A. 10
// B. B
// C. 9
// D. Compilation error
// Ans.A.