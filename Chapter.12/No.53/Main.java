public class Main {
    public static void main(String[] args) {
        byte x = 5, y = 2;
        // A.
        float a = Math.round((float) x / y * 100) / (float) 100;
        System.out.println("a : " + a);

        // B.
        float b = (float) (Math.round((float) x / y * 100) / 100);
        System.out.println("b : " + b);

        // C.
        // float c = Math.round((int) (x / y), 2);
        // System.out.println("c : " + c);

        // D.
        // float d = Math.round((float) (x / y), 2);
        // System.out.println("d : " + d);
    }
}

// 55. 2.5と表示するものをA～Dから選べ。
// A. 〇
// B. / 100のところでintになる
// C.D. 引数がおかしい。引数を直しても、2.5をroundするので2になる。