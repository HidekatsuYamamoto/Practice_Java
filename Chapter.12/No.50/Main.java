public class Main {
    public static void main(String[] args) {
        int num = 0;
        do {
            num++;
            if (num == 1) {
                continue;
            }
            System.out.println(num);
        } while (num < 1);
    }
}
// A. 0 1
// B. 0
// C. 1
// D. nothing is displayed
//
// Ans.D